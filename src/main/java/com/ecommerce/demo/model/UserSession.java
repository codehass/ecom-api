package com.ecommerce.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserSession {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "session_id")
  private Long sessionId;
  private String token;
  private Integer userId;
  private String userType;
  private LocalDateTime sessionStartTime;
  private LocalDateTime sessionEndTime;

  public Long getSessionId() {
    return sessionId;
  }

  public void setSessionId(Long sessionId) {
    this.sessionId = sessionId;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }

  public LocalDateTime getSessionStartTime() {
    return sessionStartTime;
  }

  public void setSessionStartTime(LocalDateTime sessionStartTime) {
    this.sessionStartTime = sessionStartTime;
  }

  public LocalDateTime getSessionEndTime() {
    return sessionEndTime;
  }

  public void setSessionEndTime(LocalDateTime sessionEndTime) {
    this.sessionEndTime = sessionEndTime;
  }
}
