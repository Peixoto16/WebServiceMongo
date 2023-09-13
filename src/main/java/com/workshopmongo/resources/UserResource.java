package com.workshopmongo.resources;

import com.workshopmongo.model.User;
import com.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserService service;

    //GetMapping
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity <List<User>> findAll(){
        List<User> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

}
