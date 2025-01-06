package com.ecommerce.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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
  private List<Product> products = new ArrayList<Product>();

}
