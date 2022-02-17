package com.poduct.repository;

import com.poduct.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {

    @Query("SELECT c FROM Customer c WHERE c.firstName = ?1")
    Optional<Customer> getCustomerByName(String name);
}
