package com.example.demo.repository;

import com.example.demo.model.Proveedor;

import java.util.List;

public interface ProveedorRepository {

    List<Proveedor> listarProveedores();

    List<Proveedor> findAll();
}
