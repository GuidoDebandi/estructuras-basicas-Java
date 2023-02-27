package com.example.demo.config.auth;


import com.example.demo.model.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(exclude = { "authorities" })
public class CustomUserDetails implements UserDetails {
    private static final long serialVersionUID = 7415348817505443282L;

    private User user;
    private Boolean emailVerified;
    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.getUser() != null ? this.getUser().getEmail() : null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.getUser() != null;
    }

    public CustomUserDetails( User user) {
        this.setUser(user);
    }

}