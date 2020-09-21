package com.andre.study.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserReg {

    @NotNull(message = "Tên là bắc buộc!")
    @NotEmpty(message = "Tên là bắc buộc!")
    private String name;

    @NotNull(message = "Email là bắc buộc!")
    @NotEmpty(message = "Email là bắc buộc!")
    @Email(message = "Email sai định dạng")
    private String email;

    private String role;

    @JsonProperty("pass")
    private String password;
}
