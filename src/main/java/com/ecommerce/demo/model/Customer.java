package com.ecommerce.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer {
  @Id // Primary key annotation
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "customer_id")
  private  Long customerId;
  @Column(name = "first_name")
  private  String firstName;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "mobile_no")
  private String mobileNo;
  @Column(name = "email_id")
  private String emailID;
  private String password;
  @Column(name = "created_on")
  private LocalDateTime createdOn;

  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
  private Map<String, Address> addresses = new HashMap<String, Address>();

  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Order> orders = new ArrayList<Order>();

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
  private Cart customerCart;

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public String getEmailID() {
    return emailID;
  }

  public void setEmailID(String emailID) {
    this.emailID = emailID;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LocalDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(LocalDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public Map<String, Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(Map<String, Address> addresses) {
    this.addresses = addresses;
  }

  public List<Order> getOrders() {
    return orders;
  }

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }

  public Cart getCustomerCart() {
    return customerCart;
  }

  public void setCustomerCart(Cart customerCart) {
    this.customerCart = customerCart;
  }
}
