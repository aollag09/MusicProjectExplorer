package com.mowmow.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mowmow.model.schema.Artist;

public interface ArtistRespository extends MongoRepository< Artist, String > {

}
