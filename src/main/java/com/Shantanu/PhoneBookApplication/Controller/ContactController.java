package com.Shantanu.PhoneBookApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Shantanu.PhoneBookApplication.Model.Contact;
import com.Shantanu.PhoneBookApplication.Service.ContactServiceIMPL;

@RestController
public class ContactController {

	@Autowired
	private ContactServiceIMPL contactServiceIMPL;

	@PostMapping(value = "/saveContact", consumes = "APPLICATION/JSON")
	public ResponseEntity<String> savecontact(@RequestBody Contact contact) {

		boolean savecontact = contactServiceIMPL.savecontact(contact);
		if (savecontact = true) {
			String msg = "Contact save successfully";
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} else {

			String msg = "contact not save";
			return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}
	}

	// ------------------------------------------------------------------------------------------------
	// Retrive all data
	// ------------------------------------------------------------------------------------------------

	@GetMapping(value = "/getllrecords", produces = "APPLICATION/JSON")
	public ResponseEntity<List<Contact>> getllrecords() {

		List<Contact> getllrecords = contactServiceIMPL.getllrecords();

		if (getllrecords != null) {
			return new ResponseEntity<List<Contact>>(getllrecords, HttpStatus.OK);
		} else {

			String msg = "deta not found";
			return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
		}
	}

	// ------------------------------------------------------------------------------------------------
	// Find by id
	// ------------------------------------------------------------------------------------------------

	@GetMapping(value = "/getcontactbyid/{contactId}")
	public ResponseEntity<Contact> getcontactbyid(@PathVariable Integer contactId) {
		Contact getcontactbyid = contactServiceIMPL.getcontactbyid(contactId);
		if (getcontactbyid != null) {
			return new ResponseEntity<Contact>(getcontactbyid, HttpStatus.OK);
		} else {
			String msg = "data not found";
			return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
		}
	}

	// ------------------------------------------------------------------------------------------------
	// delete by id
	// ------------------------------------------------------------------------------------------------

	@DeleteMapping(value = "/Deletecontactbyid/{contactId}")
	public String Deletecontactbyid(@PathVariable Integer contactId) {

		boolean deletecontactbyid = contactServiceIMPL.Deletecontactbyid(contactId);
		if (deletecontactbyid == true) {
			return "contact delete successfully";
		} else {
			return "Contact is not found";

		}
	}
	// ------------------------------------------------------------------------------------------------
	// update
	// ------------------------------------------------------------------------------------------------

	@PutMapping(value ="/Updatecontact" )
	public ResponseEntity<String> Updatecontact( Contact contact) 
{
		boolean updatecontact = contactServiceIMPL.Updatecontact(contact);
		if(updatecontact == true) {
			String msg="ok";
	return new ResponseEntity<String>(msg,HttpStatus.CREATED) ;
	}else {
		String msg="NOT ok";
		return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST) ;
	}
	
}
}
