package com.andre.study.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserReg {
    private int id;

    private String name;

    private String email;

    private String role;

    @JsonProperty("pass")
    private String password;
}
