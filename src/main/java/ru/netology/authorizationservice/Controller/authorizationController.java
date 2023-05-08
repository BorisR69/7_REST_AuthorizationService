package ru.netology.authorizationservice.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.authorizationservice.Permissions.authorities;
import ru.netology.authorizationservice.Service.authorizationService;

import java.util.List;
@RestController
@AllArgsConstructor
public class authorizationController {
    authorizationService service;

    @GetMapping("/authorize")
    public List<authorities> getAuthorities(@RequestParam("login") String login, @RequestParam("password") String password) {
        return service.getAuthorities(login, password);
    }
}
