package com.example.demo.config.auth;


import com.example.demo.client.msusercore.MsUserCoreClient;
import com.example.demo.client.msusercore.exception.MsUserCoreException;
import com.example.demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserDetailsServiceImp implements UserDetailsService {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserDetailsServiceImp.class);

    private final MsUserCoreClient userClient;

    public UserDetailsServiceImp (MsUserCoreClient userClient){
        this.userClient = userClient;
    }

    @Override
    public CustomUserDetails loadUserByUsername(String uuid) {
        try {
            User user = userClient.findByUUID(uuid).getData();
            return new CustomUserDetails(user);
        } catch (MsUserCoreException ex) {
            LOGGER.warn("User {} not found", uuid);
            throw new UsernameNotFoundException("User " + uuid + " not found");
        }
    }

}
