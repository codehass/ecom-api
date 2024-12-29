package com.ecommerce.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Map;

@Entity
public class Customer {
  @Id // Primary key annotation
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  Integer customerId;
  private  String firstName;
  private String lastName;
  private String mobileNo;
  private String emailID;
  private String password;
  private LocalDateTime createdOn;
  private Map<String, String> addresses;

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
}
