package com.workshopmongo.repository;

import com.workshopmongo.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PostRepository extends MongoRepository<Post, String> {

        @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
        List<Post> findByTitle(String text);

        List<Post> findByTitleContainingIgnoreCase(String text);


}
