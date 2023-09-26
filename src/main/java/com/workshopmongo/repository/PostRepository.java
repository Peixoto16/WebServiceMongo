package com.workshopmongo.repository;

import com.workshopmongo.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {


}
