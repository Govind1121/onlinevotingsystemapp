/*
 * @author Shobhit Kumar Shaw
 * 
 */


package org.society.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ElectionOfficer implements Serializable {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long officerId;
	private String firstName;
	private String lastName;
	private String password;
	private String gender;
	private String mobileno;
	private String emailId;
	private String address1;
	private String address2;
	private String district;
	private int pincode;
	
	public ElectionOfficer() {
		super();
		
	}
	
	public Long getOfficerId() {
		return officerId;
	}




	public void setOfficerId(Long officerId) {
		this.officerId = officerId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "ElectionOfficer [officerId=" + officerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", password=" + password + ", gender=" + gender + ", mobileno=" + mobileno + ", emailId=" + emailId
				+ ", address1=" + address1 + ", address2=" + address2 + ", district=" + district + ", pincode="
				+ pincode + "]";
	}
	
	
	
	
}
