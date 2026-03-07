package com.example.springcrud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.springcrud.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findByUsernameAndRole(String username, String role);

}