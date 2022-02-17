package com.poduct.controller.customerController;

import com.poduct.entity.Customer;
import com.poduct.service.CustomerServic.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class CustomerHome {

    private final CustomerService customerService;

    public CustomerHome(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String indexCustomer(Model model) {
        model.addAttribute("customers " + customerService.getAllCustomers());
        model.addAttribute("customer " + new Customer("email@gmail.con"));
        return "indexhowareyou";
    }

    @PostMapping
    public String  post(Customer customer){
        customerService.save(customer);
        return "redirect:/index";
    }
}
