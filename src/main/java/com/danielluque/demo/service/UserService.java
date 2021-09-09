package com.danielluque.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.FlagTerm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.danielluque.demo.model.User;
import com.danielluque.demo.repository.UserRepository;

@Service
@Transactional(readOnly = true)
public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Transactional
	public User create(User user) {	
		return userRepository.save(user);
	}
	@Transactional
	public User update(User user) {
		return userRepository.save(user);
	}
	@Transactional
	public void delete(User user) {
		userRepository.delete(user);
	}
	
//	public User findById(int id) {
//		
//		return userRepository.findById(id);
//	}
	public List<User> findAll(){
		return userRepository.findAll();
	}
	

	


	
	
}

