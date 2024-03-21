package com.springpro.report.generater.Controller;

import com.springpro.report.generater.Entity.Customer;
import com.springpro.report.generater.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    private  CustomerService customerService;

    @PostMapping("/addCustomer")
    public Customer postDetails(@RequestBody Customer customer)
    {

        return customerService.saveDetails(customer);
    }
}
