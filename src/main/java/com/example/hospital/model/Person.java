package com.example.hospital.model;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class Person {

	@Id
	private String id; // En el ejercicio pide que sea un String
	private String title;
	@Embedded
	@Column(name = "name")
	private Fullname name;
	@Column(name = "bithDate")
	private Date bithDate;
	@Embedded
	@Column(name = "gender")
	private Gender gender;
	@Embedded
	@Column(name= "homeAddress")
	private Address homeAddress;
	@Embedded
	@Column(name= "phone")
	private Phone phone;
}
