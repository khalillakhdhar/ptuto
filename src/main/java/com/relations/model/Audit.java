package com.relations.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Audit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

}
