package com.andre.study.enitty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @Column(name="name", unique = false)
    private String name;

    @NotNull
    @Column(name="email", unique = false)
    private String email;

    @NotNull
    @Column(name="role", unique = false)
    private String role;

    @NotNull
    @Column(name="password", unique = false)
    private String password;

}
