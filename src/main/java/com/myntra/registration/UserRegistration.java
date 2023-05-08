package com.myntra.registration;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data

public class UserRegistration {
    @Id
    String registrationId;
    @NotNull
    @Pattern(regexp = "/^[a-zA-Z]+$/")
    String firstName;
    @Pattern(regexp = "/^[a-zA-Z]+$/")
    @NotNull
    String lastName;
    @NotNull
    @Pattern(regexp = "^[0-9]")
    String phoneNo;
    @NotNull
    @Pattern(regexp = "^(.+)@(\\S+)$")
    String emailId;

    @OneToOne(cascade = CascadeType.ALL)

    Address address;
    @OneToOne(cascade = CascadeType.ALL)
    SignUp signUp;

}
