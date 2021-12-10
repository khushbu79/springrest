package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.createconnection.load;

public interface LoadService {

	public Optional<load> getLoadbyId(long shipperId);
	
	public load getLoad(long courseId);
	
	public load addLoad(load c);
	
	public load updateLoad(load c);
	
	public void deleteLoad(long id);
}
