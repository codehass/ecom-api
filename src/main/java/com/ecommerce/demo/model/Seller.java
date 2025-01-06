package com.ecommerce.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sellers")
public class Seller {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "seller_id")
  private Long sellerId;
  private String firstName;
  private String lastName;
  private String mobileNo;
  private String email;
  private String password;

  @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Product> products = new ArrayList<Product>();

  public Long getSellerId() {
    return sellerId;
  }

  public void setSellerId(Long sellerId) {
    this.sellerId = sellerId;
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

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
}
