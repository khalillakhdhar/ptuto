package com.relations.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
