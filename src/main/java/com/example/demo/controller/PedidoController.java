package com.example.demo.controller;

import com.example.demo.model.Pedido;
import com.example.demo.service.IPedidoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/pedidos")
public class PedidoController {

    private final IPedidoService pedidoService;

    @GetMapping("/customer/{clienteId}/status/{estadoEnvio}")
    public List<Pedido> buscarPedidosPorClienteYEstadoLogistica(@PathVariable Integer clienteId, @PathVariable String estadoEnvio) {
        return pedidoService.buscarPedidosPorClienteYEstadoLogistica(clienteId, estadoEnvio);
    }
    @GetMapping("/cliente/{clienteId}")
    public List<Pedido> getPedidosByClienteId(@PathVariable Integer clienteId) {
        return pedidoService.findByClienteId(clienteId);
    }
}
