package com.Shantanu.PhoneBookApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Shantanu.PhoneBookApplication.Model.Contact;
import com.Shantanu.PhoneBookApplication.Service.ContactServiceIMPL;

@Controller
public class ContactController {

	@Autowired
	private ContactServiceIMPL contactServiceIMPL;

	@PostMapping(value = "/saveContact", consumes = "APPLICATION/JSON")
	public ResponseEntity<String> savecontact(@RequestBody Contact contact) {

		boolean savecontact = contactServiceIMPL.savecontact(contact);
		if (savecontact = true) {
			String msg = "Contact save successfully";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} else {

			String msg = "contact not save";
			return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
		}
	}

}
