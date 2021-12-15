package com.example.Coupons.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Coupons.Model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
