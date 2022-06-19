package com.Shantanu.PhoneBookApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.Shantanu.PhoneBookApplication.Model.Contact;
import com.Shantanu.PhoneBookApplication.Repository.ContactRepository;

@Service
public class ContactServiceIMPL implements ContactServiceI {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean savecontact(Contact contact) {
		Contact save = contactRepository.save(contact);
		if (save != null) {

			return true;
		} else {
			return false;
		}

	}
}
