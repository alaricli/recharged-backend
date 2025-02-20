package com.recharged.backend.dto;

public class CustomerRequestDTO {
  private Long id;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String emailAddress;
  private AddressRequestDTO customerAddress;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public AddressRequestDTO getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(AddressRequestDTO customerAddress) {
    this.customerAddress = customerAddress;
  }

}
