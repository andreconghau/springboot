package com.andre.study.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserReg {

    @NotNull(message = "Tên là bắc buộc!")
    @NotEmpty(message = "Tên là bắc buộc!")
    @ApiModelProperty(
            example="Andre",
            notes="name cannot be empty",
            required=true
    )
    private String name;

    @NotNull(message = "Email là bắc buộc!")
    @NotEmpty(message = "Email là bắc buộc!")
    @Email(message = "Email sai định dạng")
    @ApiModelProperty(
            example="andreconghau@gmail.com",
            notes="Email cannot be empty",
            required=true
    )
    private String email;

    private String role;

    @Size(min = 4, max = 20, message = "Pasword must be between 4 and 20 characters")
    @ApiModelProperty(
            example="verysecretpassword",
            notes="Password can't be empty",
            required=true
    )
    @JsonProperty("pass")
    private String password;
}
