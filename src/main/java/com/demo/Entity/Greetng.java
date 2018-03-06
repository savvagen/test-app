package com.demo.Entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Greetng {

    @JsonProperty("id")
    private @Getter
    @Setter
    Long id;

    @JsonProperty("message")
    private @Getter @Setter String message;

    public Greetng(){}

}
