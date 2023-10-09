package com.relations.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit extends Audit {
	@Column(nullable = false)
private String titre,description;
@Enumerated(EnumType.STRING)
private Livraison livraison;
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@OnDelete(action = OnDeleteAction.CASCADE)
@JoinColumn(referencedColumnName = "titre")
private Categorie categorie;
}
