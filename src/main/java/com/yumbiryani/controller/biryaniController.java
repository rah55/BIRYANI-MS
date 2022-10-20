package com.yumbiryani.controller;

import java.util.List;
import java.util.Optional;

import com.yumbiryani.model.biryani;
import com.yumbiryani.service.biryaniService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

public class biryaniController {
	@Autowired
	private biryaniService service;

	@RequestMapping(method = RequestMethod.POST, value = "/biryani")
	public String addBiryani(@RequestBody biryani b1) {
		return service.addBiryani(b1);
	}

	//ADD MULTIPLE BIRYANI TO DATABASE
	@RequestMapping(method = RequestMethod.POST, value = "/biryani/addall")

	public String addAllBiryani(@RequestBody List<biryani> b1) {
		return service.addAllBiryani(b1);
	}

	// TO RETRIVE ALL BIRYANIS
	@RequestMapping(method = RequestMethod.GET, value = "/biryani/")
	public List<biryani> getAllBiryani() {
		return service.getAllBiryani();
	}

	// TO RETRIVE BIRYANI WITH ID
	@RequestMapping(method = RequestMethod.GET, value = "/biryani/id/{id}")
	public Optional<biryani> getBiryaniById(@PathVariable int id) {
		return service.getBiryaniById(id);
	}

	// RETRIVE BIRYANI WITH TYPE
	@RequestMapping(method = RequestMethod.GET, value = "/biryani/type/{btype}")
	public List<biryani> getBiryaniByType(@PathVariable String btype) {
		return service.getBiryaniByType(btype);
	}

	//RETRIVE BIRYANI IN RANGE
	@RequestMapping(method = RequestMethod.GET, value = "/biryani/range/{bprice}")
	public List<biryani> getBiryaniByRange(@PathVariable int bprice) {

		return service.getBiryaniByRange(bprice);
	}

}
