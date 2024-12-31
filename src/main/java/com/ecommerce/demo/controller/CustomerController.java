package com.ecommerce.demo.controller;

import com.ecommerce.demo.model.Customer;
import com.ecommerce.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
  @Autowired
  private CustomerRepository customerRepository;

  @PostMapping
  public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
    customer.setCreatedOn(LocalDateTime.now());
    Customer customerSaved = customerRepository.save(customer);
    return new ResponseEntity<>(customerSaved, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<List<Customer>> findAll() {
    List<Customer> customers = customerRepository.findAll();
    return ResponseEntity.ok(customers);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<Customer>> getCustomer(@PathVariable Long id) {
    Optional<Customer> customer = customerRepository.findById(id);
    if (customer.isPresent()) {
      return ResponseEntity.ok(customer);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

}
