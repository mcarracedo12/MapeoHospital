package com.example.hospital.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@DiscriminatorValue("3")
@Entity
public abstract class TechnicalStaff extends Staff{

}
