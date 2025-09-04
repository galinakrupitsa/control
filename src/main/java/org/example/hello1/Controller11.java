package org.example.hello1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Controller11 {
//    private final Service11 service11;
//    public Controller11(Service11 service11, Service11 service111){
//    this.service11 = service111;


@PostMapping("/publishers")
public String result(@RequestBody UserRequest11 userRequest11) {
    return "Писатель: " + userRequest11.getName() + ", Адрес:  " + userRequest11.getAddress();
}
}

