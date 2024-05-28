package com.example.hospital.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Embeddable
public class Phone {
 private String areaCode;
 private String phoneNumber;
}
