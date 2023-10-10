package com.relations.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
public Optional<User> findByUsername(String username);
public Optional<User> findByUsernameAndPassword(String username,String password);
public Optional<List<User>> findByActive(boolean active);



}
