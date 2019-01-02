package com.mowmow.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mowmow.model.schema.Artist;

@RestController
public class ArtistController {

	@RequestMapping("/jean_artists")
	public Artist artists( @RequestParam( value="lastName", defaultValue="Ro" ) String lastName ) {
		return new Artist( "Jean", lastName );
	}
}
