package com.felipeschottz.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.felipeschottz.workshop.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
