package com.relations.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
