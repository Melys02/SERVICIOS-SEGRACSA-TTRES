package com.example.demo.service.impl;

import com.example.demo.dto.PedidoInformeDto;
import com.example.demo.model.Empaque;
import com.example.demo.model.Pedido;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.EmpaqueRepository;
import com.example.demo.repository.PedidoRepository;
import com.example.demo.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ClienteService implements IClienteService {
    private final ClienteRepository clienteRepository;
    private final PedidoRepository pedidoRepository;
    private final EmpaqueRepository empaqueRepository;


    @Override
    public List<PedidoInformeDto> obtenerPedidosPorCliente(Integer idcliente) {
        List<Pedido> pedidos = pedidoRepository.findByClienteId(idcliente);
        List<PedidoInformeDto> informes = new ArrayList<>();

        for (Pedido pedido : pedidos) {
            PedidoInformeDto informe = new PedidoInformeDto();
            informe.setPedidoId(pedido.getPedido_id());
            informe.setFechaPedido(pedido.getFechaPedido());
            informe.setTotal(pedido.getTotal());

            // Obtener detalles de los empaques relacionados (si existieran)
            List<Empaque> empaques = empaqueRepository.findByPedidoId(pedido.getPedido_id());
            informe.setEmpaques(empaques);

            informes.add(informe);
        }

        return informes;
    }
}
