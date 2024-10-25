package com.example.demo.service.impl;

import com.example.demo.model.Pedido;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.EmpaqueRepository;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.service.IPedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PedidoService implements IPedidoService {
    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private final EmpaqueRepository empaqueRepository;
    @Override
    public List<Pedido> buscarPedidosPorClienteYEstadoLogistica(Integer clienteId, String estadoEnvio) {
        return pedidoRepository.buscarPedidosPorClienteYEstadoLogistica(clienteId, estadoEnvio);
    }


    @Override
    public List<Pedido> findByClienteId(Integer cliente_id) {
        return pedidoRepository.findByClienteId(cliente_id);
    }



}
