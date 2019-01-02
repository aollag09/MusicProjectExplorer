package com.mowmow.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mowmow.model.schema.Project;

public interface ProjectRepository extends MongoRepository<Project, String> {

}
