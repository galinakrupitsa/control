package org.example.hello1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("customer/{customerID}")
    public String getCustomerPurchases(
            @PathVariable Long customerID,
            @RequestParam int purchaseNumber) {

        return customerService.customer(customerID, purchaseNumber);
    }
}
