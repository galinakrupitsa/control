package org.example.hello1;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CustomerService {
    public String customer(Long customerID, int purchaseNumber) {
        return "Клиент с номером " + customerID + "имеет" + purchaseNumber + "покупок";
    }
}
