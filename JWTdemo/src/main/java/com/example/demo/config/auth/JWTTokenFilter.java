package com.example.demo.config.auth;


import com.example.demo.model.User;
import com.example.demo.utils.VersionHolder;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class JWTTokenFilter extends OncePerRequestFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(JWTTokenFilter.class);
    private static final String USER_ID_CLAIM = "global_user_id";
    private static final String EMAIL_VERIFIED_CLAIM = "email_verified";
    private static final String EMAIL_CLAIM = "email";
    private static final String SCOPE_CLAIM = "scope";
    private static final String POINT_CHAR = ".";
    private static final String HEADER = "Authorization";
    private static final String PREFIX = "Bearer ";

    private final UserDetailsServiceImp userDetailsService;

    public JWTTokenFilter (UserDetailsServiceImp userDetailsService){
        this.userDetailsService=userDetailsService;
    }


    @Override
    protected void doFilterInternal( @NotNull HttpServletRequest request, @NotNull HttpServletResponse response, @NotNull FilterChain chain)
            throws ServletException, IOException {

        if (hasJWTToken(request)) {
            Claims claims = validateToken(request);
            if (Objects.nonNull(claims.get(SCOPE_CLAIM))) {
                setUpSpringAuthentication(claims);

            } else {
                SecurityContextHolder.clearContext();
            }
        } else {
            SecurityContextHolder.clearContext();
        }

        VersionHolder.version.set(request.getHeader("accept"));
        chain.doFilter(request, response);
    }

    private Claims validateToken(HttpServletRequest request) {
        String jwsToken = request.getHeader(HEADER).replace(PREFIX, "");

        String jwtToLog = String.join("\n", jwsToken.split("(?<=\\G.{200})"));
            LOGGER.info("JWT Token in header: \n{}", jwtToLog);

        String[] jwsTokenParts = jwsToken.split("\\.");
        String jwtToken = jwsTokenParts[0] + POINT_CHAR + jwsTokenParts[1] + POINT_CHAR;
        return Jwts.parser().parseClaimsJwt(jwtToken).getBody();
    }

    private CustomUserDetails loadOrBuildUserDetails(Claims claims) {
        String uuid = String.valueOf(claims.get(USER_ID_CLAIM));
        CustomUserDetails userDetails;
        try {
            userDetails = this.userDetailsService.loadUserByUsername(uuid);
            userDetails.setEmailVerified(
                    (Objects.nonNull(claims.get(EMAIL_VERIFIED_CLAIM))) ? (Boolean) claims.get(EMAIL_VERIFIED_CLAIM)
                            : Boolean.FALSE);
        } catch (UsernameNotFoundException e) {
            User initialUser = new User();
            initialUser.setUuid(UUID.fromString(uuid));
            initialUser.setEmail(String.valueOf(claims.get(EMAIL_CLAIM)));
            userDetails = new CustomUserDetails(initialUser);
            userDetails.setEmailVerified(
                    (Objects.nonNull(claims.get(EMAIL_VERIFIED_CLAIM))) ? (Boolean) claims.get(EMAIL_VERIFIED_CLAIM)
                            : Boolean.FALSE);
        }
        return userDetails;
    }

    /**
     * Method to auth in Spring
     *
     */
    private void setUpSpringAuthentication(Claims claims) {
        try {
            CustomUserDetails userDetails = loadOrBuildUserDetails(claims);
            List<String> scopes = Arrays.asList(((String) claims.get(SCOPE_CLAIM)).split(" "));
            UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails, null,
                    scopes.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
            SecurityContextHolder.getContext().setAuthentication(auth);
        } catch (IllegalArgumentException e) {
            LOGGER.error("Invalid uuid {}", claims.get(USER_ID_CLAIM));
            SecurityContextHolder.clearContext();
        } catch (Exception e) {
            LOGGER.error("Unexpected error with uuid {}", claims.get(USER_ID_CLAIM), e);
            SecurityContextHolder.clearContext();
        }
    }

    private boolean hasJWTToken(HttpServletRequest request) {
        String authenticationHeader = request.getHeader(HEADER);
        return authenticationHeader != null && authenticationHeader.startsWith(PREFIX);
    }

}
