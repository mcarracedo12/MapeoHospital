package com.example.hospital.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@DiscriminatorValue("AS-Receptionist")
@Entity
public final class Receptionist extends FrontDeskStaff{

}
