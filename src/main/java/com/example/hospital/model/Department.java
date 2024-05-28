package com.example.hospital.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String dept_name;
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
	private Staff[] staff;
	@ManyToOne
	@JoinColumn(name = "hospital")
	private Hospital hospital;
}
