package com.boot.controller;

import com.boot.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import com.boot.repository.userRepo;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/user")
public class userController {
	
	private final Logger logger = Logger.getLogger(userController.class.getName());
	
	@Autowired
	userRepo userRepo;	 
	
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public void create(@RequestBody user newuser){
		userRepo.save(newuser);
	}
	
	@RequestMapping(value = "/findAll")
	public List<user> findAll() {
		return userRepo.findAll();
	}
	
	@RequestMapping(value ="/find", method = RequestMethod.GET)
	public user read(@RequestParam("id") String  id){
        return userRepo.findById(id).get();
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update(user id){
		userRepo.save(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable String id) {
		userRepo.deleteById(id);
		
	}
	
}
