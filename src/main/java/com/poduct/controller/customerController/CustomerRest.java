package com.poduct.controller.customerController;

import com.poduct.entity.Customer;
import com.poduct.service.CustomerServic.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customer")
public class CustomerRest {

    private final CustomerService customerService;

    public CustomerRest(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/info/{id}")
    public Optional<Customer> getCustomerById(@PathVariable("id") Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/getAll")
    public List<Customer> getall() {
        return customerService.getAllCustomers();
    }

    @PostMapping("/post")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("/put/{id}")
    public Customer update(@RequestBody Customer customer) {
        return customerService.update(customer);
    }

    @DeleteMapping("/id/{id}")
    public void delete(@PathVariable("id") Long id) {
        customerService.deleteById(id);
    }
}
