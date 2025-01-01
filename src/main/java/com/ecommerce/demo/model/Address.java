package com.ecommerce.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "address_id")
  private  Long addressId;
  private String streetNo;
  private String buildingName;
  private String locality;
  private String city;
  private String state;
  private String pincode;
  @ManyToOne(fetch =  FetchType.LAZY)
  @JoinColumn(name = "address_id")
  private Customer customer;



  Address(String streetNo,
          String buildingName,
          String locality,
          String city,
          String state,
          String pincode,
          Customer customer){
    this.streetNo = streetNo;
    this.buildingName = streetNo;
    this.locality = locality;
    this.city = city;
    this.state = state;
    this.pincode = pincode;
    this.customer = customer;
  }
}
