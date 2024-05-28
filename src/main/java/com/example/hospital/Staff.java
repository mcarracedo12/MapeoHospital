package com.example.hospital;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public abstract class Staff extends Person{

	private Date joined;
	private String[] education;
	private String[] certification;
	private String[] languages;
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

}
