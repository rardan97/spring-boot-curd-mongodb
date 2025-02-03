package com.blackcode.spring_boot_curd_mongodb.repository;

import com.blackcode.spring_boot_curd_mongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
