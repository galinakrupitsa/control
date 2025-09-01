package org.example.hello1;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String user(String name) {
    return "Привет, " + name + "!";
}

    public int addNumbers(int a, int b) {
        return a + b;
    }
}
