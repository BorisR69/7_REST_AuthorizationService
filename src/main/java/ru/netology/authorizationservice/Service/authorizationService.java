package ru.netology.authorizationservice.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.netology.authorizationservice.Exception.invalidCredentials;
import ru.netology.authorizationservice.Exception.unauthorizedUser;
import ru.netology.authorizationservice.Permissions.authorities;

import java.util.List;
@Service
@AllArgsConstructor
public class authorizationService {
    ru.netology.authorizationservice.Repository.userRepository userRepository;

    public List<authorities> getAuthorities(String login, String password) {
        if (isEmpty(login) || isEmpty(password)) {
            throw new invalidCredentials("User name or password is empty");
        }
        List<authorities> userAuthorities = userRepository.getUserAuthorities(login, password);
        if (isEmpty(userAuthorities)) {
            throw new unauthorizedUser("Unknown user " + login);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null;
    }
}