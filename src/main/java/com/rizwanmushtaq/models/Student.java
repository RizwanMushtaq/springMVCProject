package com.rizwanmushtaq.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
  private int id;
  private String name;
  private int age;
  private String email;
  private String address;
  @JsonIgnore
  private String phoneNumber;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @JsonProperty
  public String getPhoneNumber() {
    return phoneNumber;
  }

  @JsonIgnore
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", age=" + age +
        ", email='" + email + '\'' +
        ", address='" + address + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}
