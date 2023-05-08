package ru.netology.authorizationservice.User;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class User {

    private String login;
    private String password;
    private List<ru.netology.authorizationservice.Permissions.authorities> authorities;
}
