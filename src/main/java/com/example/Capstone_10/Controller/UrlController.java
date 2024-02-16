package com.example.Capstone_10.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Capstone_10.Entity.UrlEntity;
import com.example.Capstone_10.Repository.UrlRepository;
import com.example.Capstone_10.Service.UrlService;


@RestController
     public class UrlController {
	@Autowired
	UrlService serv;
	@Autowired
	UrlRepository rep;
	@PostMapping("/url")
    public String saveUrl(@RequestBody UrlEntity url)
     {
		UrlEntity url1=rep.findByLongUrl(url.getLongUrl());
	    if (url1!=null) {
	    	
	        
	    	 return "http://localhost:8880/" +String.valueOf(url1.getId());
	        
	    } 
	    
	     else {
	    	 return serv.saveurl(url);
	    } 
	    }
	
	
}


