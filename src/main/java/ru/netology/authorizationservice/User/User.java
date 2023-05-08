package ru.netology.authorizationservice.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.authorizationservice.Permissions.Authorities;

import java.util.List;
@Data
@AllArgsConstructor
public class User {

    private String login;
    private String password;
    private List<Authorities> authorities;
}
