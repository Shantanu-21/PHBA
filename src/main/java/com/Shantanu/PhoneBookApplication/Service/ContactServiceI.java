package com.Shantanu.PhoneBookApplication.Service;

import java.util.List;

import com.Shantanu.PhoneBookApplication.Model.Contact;

public interface ContactServiceI {
	
	boolean savecontact (Contact contact);
	
	List<Contact> getllrecords();

	public Contact getcontactbyid(Integer contactId); 

	public boolean Deletecontactbyid(Integer contactId); 
}
