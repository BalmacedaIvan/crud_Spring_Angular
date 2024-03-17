package com.employees.crud.Model;

import jakarta.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre", length = 60, nullable = false)
    private String name;
    @Column(name="apellido", length = 60, nullable = false)
    private String lastname;
    @Column(name="email", length = 60, nullable = false, unique = true)
    private String email;

    public Empleado() {
    }

    public Empleado(Long id, String name, String lastname, String email) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
