package com.example.demo.service;

import com.example.demo.dto.PedidoInformeDto;

import java.util.List;

public interface IClienteService {
    List<PedidoInformeDto> obtenerPedidosPorCliente(Integer idcliente);

}
