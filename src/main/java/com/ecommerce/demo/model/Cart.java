package com.ecommerce.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "carts")
public class Cart {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cart_id")
  private Long cardId;
  private Double cartTotal;

//  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//  @JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
  @OneToMany
  private List<CartItem> cartItems = new ArrayList<CartItem>();

  @OneToOne(mappedBy = "customerCart")
  private Customer customer;

  public List<CartItem> getCartItems() {
    return cartItems;
  }

  public void setCartItems(List<CartItem> cartItems) {
    this.cartItems = cartItems;
  }

  public Long getCardId() {
    return cardId;
  }

  public void setCardId(Long cardId) {
    this.cardId = cardId;
  }

  public Double getCartTotal() {
    return cartTotal;
  }

  public void setCartTotal(Double cartTotal) {
    this.cartTotal = cartTotal;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
