package ru.netology.authorizationservice.Exception;

public class unauthorizedUser extends RuntimeException {
    public unauthorizedUser(String msg) {
        super(msg);
    }
}
