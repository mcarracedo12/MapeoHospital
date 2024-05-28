package com.example.hospital.model;

import java.util.Date;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	    discriminatorType = DiscriminatorType.STRING,
	    name = "staff_type"
	)
public abstract class Staff extends Person{

	private Date joined;
	private String[] education;
	private String[] certification;
	private String[] languages;
	@ManyToOne
	@JoinColumn(name = "department")
	private Department department;
	
}
