package com.example.hospital.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@DiscriminatorValue("TS-Technician")
@Entity
public final class Technician extends TechnicalStaff{

}
