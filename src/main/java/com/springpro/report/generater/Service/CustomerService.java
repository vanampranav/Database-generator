package com.springpro.report.generater.Service;

import com.springpro.report.generater.Entity.Customer;
import com.springpro.report.generater.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public Customer saveDetails(Customer customer){

        return customerRepo.save(customer);

    }

}
