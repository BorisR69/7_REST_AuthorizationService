package ru.netology.authorizationservice.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.netology.authorizationservice.Exception.invalidCredentials;
import ru.netology.authorizationservice.Exception.unauthorizedUser;

@ControllerAdvice
public class exceptionControllerAdvice {

    @ExceptionHandler(invalidCredentials.class)
    public ResponseEntity<String> handleInvalidCredentials(invalidCredentials e) {
        return ResponseEntity.badRequest().body("invalidCredentials: " + e.getMessage());
    }

    @ExceptionHandler(unauthorizedUser.class)
    public ResponseEntity<String> handleUnauthorizerUser(unauthorizedUser e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("unauthorizedUser:" + e.getMessage());
    }
}
