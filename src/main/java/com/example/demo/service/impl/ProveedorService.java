package com.example.demo.service.impl;

import com.example.demo.model.Proveedor;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.repository.ProveedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProveedorService implements ProveedorRepository {

    private final ProveedorRepository proveedorRepository;


    @Override
    public List<Proveedor> listarProveedores() {
        return proveedorRepository.findAll();
    }

    @Override
    public List<Proveedor> findAll() {
        return proveedorRepository.findAll();
    }


}
