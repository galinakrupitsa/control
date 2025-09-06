package org.example.hello1;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class PostControl {

    @PostMapping("/user")
    public String createUser(@RequestBody UserRequest userRequest) {
        return "Пользователь: " + userRequest.getName() + ", фамилия: " + userRequest.getSecondName();
    }

    @Service
    public static class LastService {
    }
}
