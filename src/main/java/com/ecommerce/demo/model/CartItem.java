package com.ecommerce.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CartItem {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cart_item_id")
  private Long cardItemId;
  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinColumn(name = "product_id", referencedColumnName = "product_id",unique = true)
  private Product product;
  @Column(name = "card_item_quantity")
  private Integer cardItemQuantity;

  public Long getCardItemId() {
    return cardItemId;
  }

  public void setCardItemId(Long cardItemId) {
    this.cardItemId = cardItemId;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Integer getCardItemQuantity() {
    return cardItemQuantity;
  }

  public void setCardItemQuantity(Integer cardItemQuantity) {
    this.cardItemQuantity = cardItemQuantity;
  }
}
