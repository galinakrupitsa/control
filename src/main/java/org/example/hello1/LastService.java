package org.example.hello1;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service

public class LastService {

        public Map<String, Object> createPublisher(Long languageId, Long id, int quantity, LastClass lastClass) {
            return Map.of(
                    "languageId", languageId,
                    "ID", id,
                    "quantity", quantity,
                    "publisher", Map.of(
                            "name", lastClass.getName(),
                            "address", lastClass.getAddress()
                    )
            );
        }
}
