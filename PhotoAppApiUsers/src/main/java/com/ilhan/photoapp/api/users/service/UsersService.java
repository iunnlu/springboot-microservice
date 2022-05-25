package com.ilhan.photoapp.api.users.service;

import com.ilhan.photoapp.api.users.shared.UserDto;

public interface UsersService {
    UserDto createUser(UserDto userDetails);
}