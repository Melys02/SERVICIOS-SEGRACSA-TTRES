package com.example.demo.controller;

import com.example.demo.dto.PedidoInformeDto;
import com.example.demo.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/clientes")
public class ClienteController {

    private final IClienteService clienteService;

    @GetMapping("/{id}/pedidos")
    public ResponseEntity<List<PedidoInformeDto>> obtenerPedidosPorCliente(@PathVariable Integer id) {
        List<PedidoInformeDto> informes = clienteService.obtenerPedidosPorCliente(id);
        return new ResponseEntity<>(informes, HttpStatus.OK);
    }

}
