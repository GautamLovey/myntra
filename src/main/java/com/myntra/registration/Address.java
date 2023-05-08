package com.myntra.registration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
    String state;
    String city;
    String street;
    String houseNo;
    @Id
    String pinCode;
    String landMark;

}
