package com.yumbiryani.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.yumbiryani.model.biryani;
import com.yumbiryani.repository.biryaniRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class biryaniService {

	@Autowired
	private biryaniRepository biryaniRepo;
	
	//ADDING BIRYANI
	public String addBiryani(biryani b1) {
		biryaniRepo.save(b1);
		return "BIRYANI IS ADDED";
	}

	//ADDING LIST OF BIRYANIS
		public String addAllBiryani(List<biryani> blist) {
			biryaniRepo.saveAll(blist);
			
			return "All biryanis added successfully";
		}
		
		//RETRIEVING ALL BIRYANIS
		public List<biryani> getAllBiryani(){
			
			List<biryani> allbiryani=new ArrayList<>();		
			
			biryaniRepo.findAll().forEach(allbiryani::add);
			return allbiryani;
			
		}
		//RETRIVE BIRYANIS BY ID
		public Optional<biryani> getBiryaniById(int id) {
			return biryaniRepo.findById(id);
		}
		//RETRIVE BIRYANI BY THERE TYPE
		public List<biryani> getBiryaniByType(String btype){
			
			return biryaniRepo.findByBiryaniType(btype);
			
		}
		//RETRIEVE BRIYANI BY RANGE
		public List<biryani> getBiryaniByRange(int bprice){
			return biryaniRepo.findByBiryaniPrice(bprice);
		}
}
