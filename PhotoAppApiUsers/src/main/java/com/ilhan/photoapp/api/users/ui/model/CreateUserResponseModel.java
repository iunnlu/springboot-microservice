package com.ilhan.photoapp.api.users.ui.model;

import lombok.Data;

@Data
public class CreateUserResponseModel {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
}
