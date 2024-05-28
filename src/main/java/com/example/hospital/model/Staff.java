package com.example.hospital.model;

import java.util.Date;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(
	    discriminatorType = DiscriminatorType.INTEGER,
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
