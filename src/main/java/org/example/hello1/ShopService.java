package org.example.hello1;

import org.springframework.stereotype.Service;

@Service
public class ShopService {
    public String countOfoOrders(String summ) {
        return "число заказов" + summ;
    }
}
