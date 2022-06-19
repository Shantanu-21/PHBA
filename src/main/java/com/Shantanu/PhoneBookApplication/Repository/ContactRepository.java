package com.Shantanu.PhoneBookApplication.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Shantanu.PhoneBookApplication.Model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Serializable > {

}
