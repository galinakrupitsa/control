package org.example.hello1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class LastController {

    private final LastController lastController;
    public LastController(LastController lastController) {
        this.lastController = lastController;

    }
    @PostMapping("language/{languageID}/publishers")
    public ResponseEntity<Map<String, Object>> createPublisher(
            @PathVariable Long languageID,
            @RequestParam("ID") Long id,
            @RequestParam("quantity") int quantity,
            @RequestBody LastClass lastClass) {

        Map<String, Object> response = lastController.createPublisher(languageID, id, quantity, lastClass).getBody();
        return ResponseEntity.ok(response);
    }
}

