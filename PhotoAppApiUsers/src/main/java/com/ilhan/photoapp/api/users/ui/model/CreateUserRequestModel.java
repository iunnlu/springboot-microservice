package com.ilhan.photoapp.api.users.ui.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CreateUserRequestModel {
    @NotNull(message = "First name cannot be null")
    @Size(min = 2, message = "First name must not be less than 2 character")
    private String firstName;
    @NotNull(message = "Last name cannot be null")
    @Size(min = 2, message = "Last name must not be less than 2 character")
    private String lastName;
    @NotNull(message = "Username cannot be null")
    @Size(min = 3, message = "Username must not be less than 3 character")
    private String username;
    @NotNull(message = "Password cannot be null")
    @Size(min = 8, max = 16, message = "Password must be equal or greater than 8 character and less than 16 character")
    private String password;
    @NotNull(message = "Email cannot be null")
    @Email
    private String email;
}
