package ru.netology.authorizationservice.Exception;

public class invalidCredentials extends RuntimeException {
    public invalidCredentials(String msg) {
        super(msg);
    }
}
