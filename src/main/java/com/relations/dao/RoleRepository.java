package com.relations.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
