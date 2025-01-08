package com.ecommerce.demo.model;

import com.ecommerce.demo.model.enums.OrderStatusValues;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_id")
  private Long orderId;
  @Column(name = "order_date")
  private LocalDateTime orderDate;
  private OrderStatusValues orderStatus;
  private Double total;
  //private CreditCard cardNumber;
  //ManyToOne
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "customer_id")
  private Customer customer;
  //ManyToMany relation
  private List<CartItem> orderedItems;
  // OneToOne
  @OneToOne
  @JoinColumn(name = "address_id",referencedColumnName = "address_id", unique = true)
  private Address address;

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public List<CartItem> getOrderedItems() {
    return orderedItems;
  }

  public void setOrderedItems(List<CartItem> orderedItems) {
    this.orderedItems = orderedItems;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }

  public OrderStatusValues getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(OrderStatusValues orderStatus) {
    this.orderStatus = orderStatus;
  }

  public LocalDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(LocalDateTime orderDate) {
    this.orderDate = orderDate;
  }
}
