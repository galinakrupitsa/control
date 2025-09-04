package org.example.hello1;

import org.springframework.stereotype.Service;

@Service
public class Service11 {
    public String publisherInfo(String name, String address){
        return "Publisher name " + name + " address " + address;
    }

}
