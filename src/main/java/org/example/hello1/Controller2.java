package org.example.hello1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
@GetMapping("/hello/{user}")
    public String hello(
            @PathVariable String user,
            @RequestParam(defaultValue = "1") int level)
{   String exclamations = "!".repeat(Math.max(0, level));
    return "hello, " + user + exclamations  ;
}

}
