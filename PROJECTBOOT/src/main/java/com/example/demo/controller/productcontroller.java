package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.productentity;
import com.example.demo.repository.PRODUCTREPO;

@RestController
public class productcontroller {
@Autowired
	public PRODUCTREPO Repo;
		@PostMapping("/addpro")
		public productentity addproduct(@RequestBody productentity pro) {
			try {
				Repo.save(pro);
				return pro;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		@GetMapping("/getpro")
		public List<productentity>getpro() {
			try {
				return Repo.findAll();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		@PutMapping("/updatepro")
		public productentity updateproduct(@RequestBody productentity pro) {
			try {
				Repo.save(pro);
				return pro;
			}catch(Exception e)	{
				e.printStackTrace();
			}
			return null;
		}
		
@SuppressWarnings("deprecation")
@DeleteMapping("/deletepro/{id}")
public String deleteuser(@PathVariable int id) {
	try {
		productentity pro=Repo.getOne(id);;
		Repo.delete(pro);
		return "product deleted";
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
			
}
}

			
			
			
			
			
			


	
	
	
	
	


