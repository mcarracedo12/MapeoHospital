package com.example.hospital.model;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Phone {
 private String areaCode;
 private String phoneNumber;
}
