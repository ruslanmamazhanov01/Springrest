package com.poduct.service.CustomerServic;

import com.poduct.entity.Customer;
import org.apache.catalina.User;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CustomerService {


    Optional<Customer> getCustomerById(Long id);

    Optional<Customer> getCustomerByName(String name);

    List<Customer> getAllCustomers();

    Customer save(Customer customer);

    Customer update(Customer customer);

    void deleteById(Long id);

}
