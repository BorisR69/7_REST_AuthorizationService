package ru.netology.authorizationservice.Repository;

import org.springframework.stereotype.Repository;
import ru.netology.authorizationservice.Permissions.authorities;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static ru.netology.authorizationservice.Permissions.authorities.*;
import ru.netology.authorizationservice.User.User;
@Repository
public class userRepository {

    private Map<String, User> users = new ConcurrentHashMap<>();

    {
        User user1 = new User("User_1", "pass_1", Arrays.asList(READ, WRITE, DELETE));
        User user2 = new User("User_2", "pass_2", Arrays.asList(DELETE));
        User user3 = new User("User_3", "pass_3", List.of(READ, WRITE));

        users.put(user1.getLogin(), user1);
        users.put(user2.getLogin(), user2);
        users.put(user3.getLogin(), user3);
    }

    public List<authorities> getUserAuthorities(String login, String password) {
        User user = users.get(login);
        return (user != null && user.getPassword().equals(password)) ? user.getAuthorities() : null;
    }
}
