package com.mowmow.model.schema;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Project {

	@Id
	public String identifer;
	
	/** Name of the project */
	public String name;
	
	/** Participant */
	public List<Artist> members;

	public Project(String name, List<Artist> members) {
		super();
		this.name = name;
		this.members = members;
	}
	
	
	
}
