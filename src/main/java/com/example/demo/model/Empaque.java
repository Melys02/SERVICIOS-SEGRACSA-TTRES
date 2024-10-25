package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "empaques")
public class Empaque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idempaque;
    private String nombre;
    private String dimensiones;
    private String material;
    private Double precio;

}
