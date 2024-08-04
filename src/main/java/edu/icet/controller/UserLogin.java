package edu.icet.controller;

import edu.icet.dto.User;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserLogin {

    final UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User user){
         return userService.login(user);
    }
    @PostMapping("/register")
    public String register( @RequestBody User user1){
        return userService.register(user1);
    }


}

