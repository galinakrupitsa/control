package org.example.hello1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

public class Hellocontroller {
    @RestController
    public static class HelloController {
        @GetMapping("/user")
        public Map<String, String> getUser() {
            return Map.of("name", "Alice", "role", "admin");
        }

    }
}
