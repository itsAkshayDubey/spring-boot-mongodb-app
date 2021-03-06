package com.github.itsAkshayDubey.springbootnosql.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.github.itsAkshayDubey.springbootnosql.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer>{
	
    @Query("{ 'id': ?0 }")
    User findUserById(int id);
    
    void deleteById(int id);
    
    long count();
    
    List<User> findByIsEnabledIsTrue();
    
    List<User> findByIsEnabledIsFalse();

}
