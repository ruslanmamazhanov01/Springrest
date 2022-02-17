package com.poduct.service.CustomerServic;

import com.poduct.entity.Customer;
import com.poduct.repository.CustomerRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepo.findById(id);
    }

    @Override
    public Optional<Customer> getCustomerByName(String name) {
        return customerRepo.getCustomerByName(name);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public void deleteById(Long id) {
        customerRepo.deleteById(id);
    }
}
