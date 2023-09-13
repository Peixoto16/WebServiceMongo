package com.workshopmongo.resources;

import com.workshopmongo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestMapping(value = "/users")
@RestController
public class UserResource {

//GetMapping
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity <List<User>> findAll(){
        User israel = new User("1","Israel Peixoto", "israel@gmail.com");
        User pedro = new User("2","Pedro Peixoto", "pedro@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(israel, pedro));
        return ResponseEntity.ok().body(list);
    }

}
