package ru.netology.authorizationservice.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.netology.authorizationservice.Exception.InvalidCredentials;
import ru.netology.authorizationservice.Exception.UnauthorizedUser;

@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> handleInvalidCredentials(InvalidCredentials e) {
        return ResponseEntity.badRequest().body("InvalidCredentials: " + e.getMessage());
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> handleUnauthorizerUser(UnauthorizedUser e) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("UnauthorizedUser:" + e.getMessage());
    }
}
