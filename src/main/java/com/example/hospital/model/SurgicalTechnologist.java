package com.example.hospital.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@DiscriminatorValue("TS-Surgical Technologist")
@Entity
public final class SurgicalTechnologist extends Technologist{

}
