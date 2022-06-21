package com.Shantanu.PhoneBookApplication.Service;

import java.util.List;
import java.util.Optional;

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
//------------------------------------------------------------------------------------------------
	// Retrive all data
//------------------------------------------------------------------------------------------------		

	@Override
	public List<Contact> getllrecords() {

		List<Contact> findAll = contactRepository.findAll();

		return findAll;
	}

	// ------------------------------------------------------------------------------------------------
	// Find by id
	// ------------------------------------------------------------------------------------------------

	@Override
	public Contact getcontactbyid(Integer contactId) {

		Optional<Contact> findById = contactRepository.findById(contactId);

		if (findById.isPresent()) {
			Contact contact = findById.get();
			return contact;
		}
		return null;
	}

	// ------------------------------------------------------------------------------------------------
	// Delete by id
	// ------------------------------------------------------------------------------------------------

	@Override
	public boolean Deletecontactbyid(Integer contactId) {

		Optional<Contact> findById = contactRepository.findById(contactId);

		if (findById.isPresent()) {
			contactRepository.deleteById(contactId);
			return true;
		} else {
			return false;

		}
	}

	// ------------------------------------------------------------------------------------------------
	// Update
	// ------------------------------------------------------------------------------------------------
	@Override
	public boolean Updatecontact(Contact contact) {
		Contact save = contactRepository.save(contact);
		if (save != null) {
			return true;
		} else {
			return false;

		}
	}

}
