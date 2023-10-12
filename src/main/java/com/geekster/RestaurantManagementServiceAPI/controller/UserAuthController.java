package com.geekster.RestaurantManagementServiceAPI.controller;

import com.geekster.RestaurantManagementServiceAPI.Service.UserAuthTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAuthController {
    @Autowired
    UserAuthTokenService userAuthTokenService;
}
