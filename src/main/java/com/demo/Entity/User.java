package com.demo.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    @JsonProperty("userId")
    private @Getter @Setter Long userId;
    @JsonProperty
    private @Getter @Setter String firstName;
    @JsonProperty
    private @Getter @Setter String lastName;
    @JsonProperty("email")
    private @Getter @Setter String email;
    @JsonIgnore
    @JsonProperty
    private @Getter @Setter String password;
    @JsonProperty
    private @Getter @Setter List<String> phones;

    public User(){}

}
