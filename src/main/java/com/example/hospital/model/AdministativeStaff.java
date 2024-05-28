package com.example.hospital.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue("2")
@Entity
public abstract class AdministativeStaff extends Staff{

}
