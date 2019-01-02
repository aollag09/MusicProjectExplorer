package com.mowmow.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mowmow.model.schema.Music;

public interface MusicRepository extends MongoRepository<Music, String> {

}
