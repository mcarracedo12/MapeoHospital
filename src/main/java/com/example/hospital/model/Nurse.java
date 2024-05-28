package com.example.hospital.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@DiscriminatorValue("OS-Nurse")
@Entity
public final class Nurse extends OperationsStaff{

}
