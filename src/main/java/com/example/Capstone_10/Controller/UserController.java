package com.example.Capstone_10.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Capstone_10.Entity.UserEntity;
import com.example.Capstone_10.Repository.UserRepository;
import com.example.Capstone_10.Service.UserService;


@RestController
public class UserController {

	@Autowired
	UserService userServ;
	@Autowired
	UserRepository userrepo;
	@PostMapping("/u")
	public String saveUser(@RequestBody UserEntity user)
	{
		if(userrepo.existsByMail(user.getMail())==true)
		{
			return "User Already exists";
		}
		else {
			 userServ.saveuser(user);
			 return "Created your account successfully";
		}
				
	}
	@PostMapping("/login")
    public String loginUser(@RequestBody UserEntity user) {
        
        boolean authenticated = userServ.authenticateUser(user.getMail(), user.getPassword());
        
        if (authenticated) {
            return "Login successful";
        } else {
            return "Invalid email or password";
        }
    }
}
