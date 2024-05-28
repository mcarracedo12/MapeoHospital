package com.example.hospital.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
@DiscriminatorValue("OS-Surgeon")
@Entity
public final class Surgeon extends Doctor{

}
