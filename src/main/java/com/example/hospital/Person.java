package com.example.hospital;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
//import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
//@DiscriminatorColumn(name = "DTYPE")
public abstract class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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
