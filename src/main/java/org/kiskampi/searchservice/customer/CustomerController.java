package org.kiskampi.searchservice.customer;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    @GetMapping
    public Page<Customer> getAllCustomers() {
        return (Page<Customer>) customerRepository.findAll();
    }

    @PostMapping
    public Customer indexCustomer(@RequestBody Customer customerDto) {
        return customerRepository.save(customerDto);
    }

}
