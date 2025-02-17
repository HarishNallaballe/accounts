package com.eazybytes.accounts.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

	public Customer(LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy,
			Long customerId, String name, String email, String mobileNumber) {
		super(createdAt, createdBy, updatedAt, updatedBy);
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
		super(createdAt, createdBy, updatedAt, updatedBy);
		// TODO Auto-generated constructor stub
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", mobileNumber="
				+ mobileNumber + "]";
	}
   
}
