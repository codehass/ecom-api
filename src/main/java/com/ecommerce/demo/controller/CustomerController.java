package com.ecommerce.demo.controller;

import com.ecommerce.demo.model.Customer;
import com.ecommerce.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
  @Autowired
  private CustomerRepository customerRepository;

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
      return ResponseEntity.notFound().build();  // Return 404 if not found
    }
  }
}
