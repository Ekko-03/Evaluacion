package com.envios_ya.cl.enviosya.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table (name="Usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (unique = true, length = 13, nullable = false)
    private String run;

    @Column (nullable = false)
    private String nombre;

    @Column (nullable = false)
    private String apellido;

    @Column (nullable = false)
    private Integer codigoPostal;

    @Column (nullable = false)
    private String direccion;

    @Column (nullable = false)
    private String correo;

    @Column (nullable = false)
    private Integer numeroTelefono;

    @Column (name = "fecha_nacimiento", nullable = true)
    private Date fechaNacimiento;



}
