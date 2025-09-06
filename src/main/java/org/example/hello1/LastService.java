package org.example.hello1;

import org.springframework.stereotype.Service;

@Service

public class LastService {

        public String pubInfo(String name, String address) {
            return "Publisher name " + name + " address " + address;
        }
}
