package com.ilhan.photoapp.api.users.service;

import com.ilhan.photoapp.api.users.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {
    UserDto createUser(UserDto userDetails);
    UserDto getUserDetails(String username);
}