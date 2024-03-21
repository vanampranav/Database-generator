package com.springpro.report.generater.Repository;

import com.springpro.report.generater.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
