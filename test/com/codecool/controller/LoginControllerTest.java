package com.codecool.controller;

import com.codecool.entity.UserRole;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginControllerTest {

    @Test
    void getInstance() {
    }

    @Test
    void resolveLogin() {
        LoginController controller = LoginController.getInstance();
        Assertions.assertEquals(UserRole.MANAGER, controller.resolveLogin("Manager", "1234").getUserRole());
        Assertions.assertEquals(UserRole.USER, controller.resolveLogin("User", "1234").getUserRole());
    }
}