package com.myntra.registration;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
public class SignUp {
    @NotNull
    @Id
    @JsonProperty("phoneNo")
    @JsonAlias("emailId")
    String userId;
    @Pattern(regexp = "^[\\p{Alnum}]{1,32}$")
    @NotNull
    String password;

}
