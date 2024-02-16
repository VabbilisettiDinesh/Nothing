package com.example.Capstone_10.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Capstone_10.Entity.UserEntity;
import com.example.Capstone_10.Repository.UserRepository;



@Service
public class UserService {
     @Autowired
     UserRepository userRep;
     
     
	public UserEntity saveuser(UserEntity user) {
		return userRep.save(user);
	}


	public  boolean authenticateUser(String mail, String password) {
        UserEntity user = userRep.findByMail(mail);
        
        if (user != null) {
            
            return user.getPassword().equals(password);
        }
		return false;
	}
	
	

}
