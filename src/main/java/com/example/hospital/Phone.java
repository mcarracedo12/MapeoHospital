package com.example.hospital;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Getter
@Setter
@Embeddable
public class Phone {
 private String areaCode;
 private String phoneNumber;
}
