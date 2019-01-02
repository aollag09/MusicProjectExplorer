package com.mowmow.model.schema;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;

public class Music {
	
	@Id
	public String identifier;
	
	/** The name of the song */
	public String name;
	
	/** The project associated to the song */
	public Project project;

	@CreatedDate
	public Date created;
	
	@LastModifiedDate
	public Date modified;

	public Music(String name, Project project, Date created, Date modified) {
		super();
		this.name = name;
		this.project = project;
		this.created = created;
		this.modified = modified;
	}
	
	
	
}
