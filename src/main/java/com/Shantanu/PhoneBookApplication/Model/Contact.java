package com.Shantanu.PhoneBookApplication.Model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "CONTACT_DTLS")
public class Contact {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "CONTACT_ID")
private Integer contactId;

@Column(name = "CONTACT_NAME")
private String contactName;

@Column(name = "CONTACT_NUMBER")
private String contactNumber;

@Column(name = "CONTACT_EMAIL")
private String contactEmail;

@Column(name = "ACTIVE_SW")
private Character activeSW;

@Column(name = "CREATED_DATE",updatable = false)
@CreationTimestamp
private LocalDate createDate;

@Column(name = "UPDATE_DATE",insertable = false)
@UpdateTimestamp
private LocalDate upadatDate;

public Integer getContactId() {
	return contactId;
}

public void setContactId(Integer contactId) {
	this.contactId = contactId;
}

public String getContactName() {
	return contactName;
}

public void setContactName(String contactName) {
	this.contactName = contactName;
}

public String getContactNumber() {
	return contactNumber;
}

public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}

public String getContactEmail() {
	return contactEmail;
}

public void setContactEmail(String contactEmail) {
	this.contactEmail = contactEmail;
}

public Character getActiveSW() {
	return activeSW;
}

public void setActiveSW(Character activeSW) {
	this.activeSW = activeSW;
}

public LocalDate getCreateDate() {
	return createDate;
}

public void setCreateDate(LocalDate createDate) {
	this.createDate = createDate;
}

public LocalDate getUpadatDate() {
	return upadatDate;
}

public void setUpadatDate(LocalDate upadatDate) {
	this.upadatDate = upadatDate;
}

@Override
public String toString() {
	return "Contact [contactId=" + contactId + ", contactName=" + contactName + ", contactNumber=" + contactNumber
			+ ", contactEmail=" + contactEmail + ", activeSW=" + activeSW + ", createDate=" + createDate
			+ ", upadatDate=" + upadatDate + "]";
}




}
