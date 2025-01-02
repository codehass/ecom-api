package com.ecommerce.demo.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

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

  public Customer(){

  }
  public Customer(String firstName, String lastName, String mobileNo, String emailID, String password){
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobileNo = mobileNo;
    this.emailID = emailID;
    this.password = password;
    this.createdOn = LocalDateTime.now();
  }

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public String getFirstName(){
    return this.firstName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public String getLastName(){
    return this.lastName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

  public String getMobileNo(){
    return this.mobileNo;
  }

  public void setMobileNo(String mobileNo){
    this.mobileNo = mobileNo;
  }

  public String getEmailID(){
    return this.emailID;
  }

  public void setEmailID(String emailID){
    this.emailID = emailID;
  }

  public String getPassword(){
    return this.password;
  }

  public void setPassword(String password){
    this.password = password;
  }

  public LocalDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(LocalDateTime createdOn) {
    this.createdOn = createdOn;
  }
}
