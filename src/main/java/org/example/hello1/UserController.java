package org.example.hello1;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name) {
        return userService.user(name);
    }

    @GetMapping("/sum")
    public int getSum(@RequestParam int a, @RequestParam int b) {
        return userService.addNumbers(a, b);
    }




}
