package com.ilhan.photoapp.api.users.ui.controller;

import com.ilhan.photoapp.api.users.service.UsersService;
import com.ilhan.photoapp.api.users.shared.UserDto;
import com.ilhan.photoapp.api.users.ui.model.CreateUserRequestModel;
import com.ilhan.photoapp.api.users.ui.model.CreateUserResponseModel;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UsersController {
    private final Environment env;
    private final UsersService usersService;
    private final ModelMapper modelMapper;

    @GetMapping("/status/check")
    public String status() {
        return "Working on port ".concat(env.getProperty("local.server.port"));
    }

    @PostMapping("/register")
    public ResponseEntity<CreateUserResponseModel> createUser(@Valid @RequestBody CreateUserRequestModel createUser) {
        UserDto userDto = modelMapper.map(createUser, UserDto.class);
        CreateUserResponseModel returnUser = modelMapper.map(usersService.createUser(userDto), CreateUserResponseModel.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(returnUser);
    }
}
