package com.example.hospital.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@DiscriminatorValue("1")
@Entity
public abstract class OperationsStaff extends Staff {

}
