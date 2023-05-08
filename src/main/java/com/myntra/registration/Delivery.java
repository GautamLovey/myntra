package com.myntra.registration;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Delivery {
    @Id
    String deliveryId;
    String deliveryDate;
    String deliveryTime;
    String deliveryAgentName;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;

}
