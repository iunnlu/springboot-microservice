package com.ilhan.photoapp.api.users.shared;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = -2639583056219617899L;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String userId;
    private String encryptedPassword;
}
