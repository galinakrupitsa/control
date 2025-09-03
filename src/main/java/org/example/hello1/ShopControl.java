package org.example.hello1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ShopControl {

    private final ShopService shopService;
    public ShopControl(ShopService shopService) {
        this.shopService = shopService;

    }


    @PostMapping("shopper/{shopperId}/orders")
    public String getShopperId (@PathVariable String shopperId,
                           @RequestParam(required = false) Double totalPriceLess) {
        return shopService.countOfoOrders(shopperId);
    }

    @GetMapping("shopper/{shopperId}/money")
    public String getMetod (@PathVariable String shopperId,
                                @RequestParam(required = false) Double totalPriceLess) {
        return shopService.metod(shopperId);
    }
}
