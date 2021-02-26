package com.moolahgo.codechallenge;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//EndPoint
//to find the owner of the referralcode and return the detail of the owner




@RestController
@CrossOrigin
public class MicroService {
	
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
	

	@RequestMapping(value="/process", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
	public String GetReferralCodeOwner(String input) throws JsonMappingException, JsonProcessingException { // receives a JSON object 
		
		String infodataAsString = "{\"rcode\":\"joereferralcode\"}";
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonInput jinput = objectMapper.readValue(infodataAsString, JsonInput.class);	//hardcode first 
		
		if(jinput.getRcode()=="joereferralcode") {
		
		InfoData d1 = new InfoData("joe", "joereferralcode");
		infodataAsString = objectMapper.writeValueAsString(d1);
		
		}
		
		return infodataAsString;
		
	}
	
	}
	
	


