package org.example.hello1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LastController {
    @PostMapping("language/{languageID}/publishers")
    public String publisher(@PathVariable("languageID") String language, @RequestBody LastClass lastClass) {
    return "LanguageID: " + language;
    }
}
