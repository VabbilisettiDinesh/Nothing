package com.example.Capstone_10.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Capstone_10.Entity.UrlEntity;
import com.example.Capstone_10.Repository.UrlRepository;


@Service
public class UrlService {
    @Autowired
    UrlRepository u;
	public String saveurl(UrlEntity url) {
	
		
		u.save(url);
		
		return "http://localhost:8880/" + String.valueOf(url.getId());
		
	}

	

}
