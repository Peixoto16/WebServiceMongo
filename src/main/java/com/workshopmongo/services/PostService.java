package com.workshopmongo.services;

import com.workshopmongo.dto.UserDTO;
import com.workshopmongo.model.Post;
import com.workshopmongo.model.User;
import com.workshopmongo.repository.PostRepository;
import com.workshopmongo.repository.UserRepository;
import com.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional <Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String text){
        return postRepository.findByTitleContainingIgnoreCase(text);
    }



}
