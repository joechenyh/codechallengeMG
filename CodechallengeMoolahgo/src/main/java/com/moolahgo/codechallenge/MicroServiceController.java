package com.moolahgo.codechallenge;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



//EndPoint
//to find the owner of the referralcode and return the detail of the owner




@RestController
@CrossOrigin
public class MicroServiceController {
	
	/*

JSONObject – similar to Java's native Map like object which stores unordered key-value pairs

JSONArray – an ordered sequence of values similar to Java's native Vector implementation

JSONTokener – a tool that breaks a piece of text into a series of tokens which can be used by JSONObject or JSONArray to parse JSON strings

CDL – a tool that provides methods to convert comma-delimited text into a JSONArray and vice versa

Cookie – converts from JSON String to cookies and vice versa

HTTP – used to convert from JSON String to HTTP headers and vice versa

JSONException – this is a standard exception thrown by this library




get(String key) – gets the object associated with the supplied key, throws JSONException if the key is not found
opt(String key)- gets the object associated with the supplied key, null otherwise
put(String key, Object value) – inserts or replaces a key-value pair in current JSONObject.


https://spring.io/guides/tutorials/rest/#_building_links_into_your_rest_api
Rest API is more than just using JSON. 


	 */
	
	
	

	@PostMapping(value="/process", consumes = "application/json", produces = "application/json")
	public String GetReferralCodeOwner(@RequestBody String input) throws JsonProcessingException { // receives a JSON object 
		
	
		ObjectMapper objectmapper = new ObjectMapper();
		
		InputObject inputobject = objectmapper.readValue(input, InputObject.class);
		
		if(inputobject.getRcode().equals("joereferralcode")) {
			
			System.out.println("condition is true");
		
		InfoData d1 = new InfoData("joe", "joereferralcode");
		
		System.out.println(d1); 
		
		String s = objectmapper.writeValueAsString(d1);

		return s;
		
		}
		

		else 
		
		return null;
		
	}
	
	}
	
	


