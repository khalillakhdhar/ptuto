package com.relations.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
