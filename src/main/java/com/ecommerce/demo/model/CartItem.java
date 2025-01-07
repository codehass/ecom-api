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
  //private Product product;
  private Integer cardItemQuantity;

  public Long getCardItemId() {
    return cardItemId;
  }

  public void setCardItemId(Long cardItemId) {
    this.cardItemId = cardItemId;
  }

  public Integer getCardItemQuantity() {
    return cardItemQuantity;
  }

  public void setCardItemQuantity(Integer cardItemQuantity) {
    this.cardItemQuantity = cardItemQuantity;
  }


}
