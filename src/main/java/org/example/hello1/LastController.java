package org.example.hello1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class LastController {

    private final LastService lastService;
    public LastController(LastService lastService) {
        this.lastService = lastService;

    }
    @PostMapping("language/{languageID}/publishers")
    public ResponseEntity<Map<String, Object>> createPublisher(
            @PathVariable Long languageID,
            @RequestParam("ID") Long id,
            @RequestParam("quantity") Long quantity,
            @RequestBody LastClass lastClass) {

        Map<String, Object> response = lastService.createPublisher(languageID, id, quantity, lastClass);
        return ResponseEntity.ok(response);
    }
}

