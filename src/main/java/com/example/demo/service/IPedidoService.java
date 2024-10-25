package com.example.demo.service;

import com.example.demo.model.Pedido;

import java.util.List;

public interface IPedidoService {

    List<Pedido> buscarPedidosPorClienteYEstadoLogistica(Integer clienteId, String estadoEnvio);
    List<Pedido> findByClienteId(Integer cliente_id);


}
