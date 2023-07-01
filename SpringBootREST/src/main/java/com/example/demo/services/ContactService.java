package com.example.demo.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Contact;
import com.example.demo.repositories.ContactRepository;

@Service
public class ContactService {

	@Autowired
	ContactRepository crepo;
	
	public List<Contact> getAll()
	{
		return crepo.findAll();
	}
	
	public Contact save(Contact c)
	{
		return crepo.save(c);
	}
	
	public Contact getOne(int cid)
	{
		//sure
		//crepo.getOne(null)
		
		//preferred - not sure
		Optional<Contact> opt = crepo.findById(cid);
		Contact c = null;
		try
		{
			c = opt.get();
		}
		catch(NoSuchElementException e)
		{
			c = null;
		}
		return c;
		
	}
	
	public List<Contact> getAllWithA()
	{
		return crepo.getAllWithA();
	}
	
	public List<Contact> getContacts(String mail, String cno)
	{
		return crepo.getContacts(mail,cno);
	}
	
	public int updateEmail(int id, String mail)
	{
		return crepo.updateEmail(id, mail);
	}
	
	
}
