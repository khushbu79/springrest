package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.springrest.createconnection.load;
import com.springrest.springrest.services.LoadService;

@RestController
public class MyController {
	
	
	@Autowired 
	private LoadService cServe;

	@GetMapping("/home")
	public String home() {
		return "Welcome to home page";
	}
		
		// get the courses
		@GetMapping("/load")
		public Optional<load> getLoad(@RequestParam long shipperId){
			return this.cServe.getLoadbyId(shipperId);
			
		}
		
		@GetMapping("/load/{loadId}")
		public load getLoad(@PathVariable String loadId) {
			
			return this.cServe.getLoad(Long.parseLong(loadId));
		}
		
		@PostMapping("/load")
		public load addLoad(@RequestBody load c) {
			return this.cServe.addLoad(c);
			
		}
		
		@PutMapping("/load")
		public load updateLoad(@RequestBody load c) {
			return this.cServe.updateLoad(c);
		}

		@DeleteMapping("/load/{loadId}")
		public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String courseId){
			try {
				this.cServe.deleteLoad(Long.parseLong(courseId));
				return new ResponseEntity<>(HttpStatus.OK);
			}
			catch(Exception e){
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

}
