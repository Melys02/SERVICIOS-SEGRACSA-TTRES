package com.example.demo.repository;

import com.example.demo.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
    //Buscar Pedidos por Cliente y Estado de Logística
    @Query(value = "SELECT p FROM Pedido p JOIN Logistica l ON p.id = l.pedido.id WHERE p.cliente.idcliente = :clienteId AND l.estadoEnvio = :estadoEnvio")
    List<Pedido> buscarPedidosPorClienteYEstadoLogistica(
            @Param("clienteId") Integer clienteId,
            @Param("estadoEnvio") String estadoEnvio);


    List<Pedido> findByClienteId(Integer cliente_id);
}