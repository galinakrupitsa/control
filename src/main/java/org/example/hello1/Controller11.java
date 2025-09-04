package org.example.hello1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/publishers")
public class Controller11 {
    private final Service11 service11;
    public Controller11(Service11 service11, Service11 service111){
    this.service11 = service111;
}

@GetMapping("api/publishers")
public String printInfo(@RequestParam String name, @RequestParam String address) {
        return service11.publisherInfo(name, address);
}
}
