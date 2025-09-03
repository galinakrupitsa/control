package org.example.hello1;

import org.springframework.stereotype.Service;

@Service
public class ShopService {
    public String countOfoOrders(String summ) {
        return "заказы" + summ;
    }

    public String metod(String a) {
        return "когда нибудь я это запомню" + a;
    }
}
