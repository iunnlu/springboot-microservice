package com.ilhan.photoapp.api.users.security;

import com.ilhan.photoapp.api.users.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@RequiredArgsConstructor
public class MySecurityDSL extends AbstractHttpConfigurer<MySecurityDSL, HttpSecurity> {
    private final UsersService usersService;
    private final Environment environment;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        AuthenticationManager authenticationManager = http.getSharedObject(AuthenticationManager.class);
        http.addFilterBefore(getAuthenticationFilter(authenticationManager), UsernamePasswordAuthenticationFilter.class);
    }

    public static MySecurityDSL securityDSL(UsersService usersService, Environment environment) {
        return new MySecurityDSL(usersService, environment);
    }

    private AuthenticationFilter getAuthenticationFilter(AuthenticationManager authenticationManager) throws Exception {
        AuthenticationFilter authenticationFilter = new AuthenticationFilter(usersService, environment, authenticationManager);
        return authenticationFilter;
    }
}
