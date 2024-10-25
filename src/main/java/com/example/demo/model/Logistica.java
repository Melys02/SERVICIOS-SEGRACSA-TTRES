package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "logistica")
public class Logistica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idlogistica;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "proveedor_id", nullable = false)
    private Proveedor proveedor;

    private Date fechaEnvio;

    private String estadoEnvio;

}
