package com.workshopmongo.repository;

import com.workshopmongo.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {

        List<Post> findByTitleContainingIgnoreCase(String text);


}
