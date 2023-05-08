package com.myntra.registration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Payment {
    @Id
    String paymentUpiId;
    String modeOfPayment;



}
