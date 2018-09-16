package com.dev.guide06.controller;

import com.dev.guide06.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("user")
    public ResponseEntity<Void> addUser(@RequestParam("userName")String userName,
                                  @RequestParam("age")Integer age){
        Boolean resultFlag = userService.addUser(userName, age);
        if (!resultFlag) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.ok().build();
    }
}
