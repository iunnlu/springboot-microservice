package com.ilhan.photoapp.api.users.data;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "users")
public class UserEntity implements Serializable {
    private static final long serialVersionUID = 901356976812985412L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 50)
    private String firstName;
    @Column(nullable = false, length = 50)
    private String lastName;
    @Column(nullable = false, length = 50)
    private String username;
    @Column(nullable = false, length = 120, unique = true)
    private String email;
    @Column(nullable = false, length = 120, unique = true)
    private String userId;
    @Column(nullable = false, length = 120, unique = true)
    private String encryptedPassword;
}
