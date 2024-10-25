package com.example.demo.dto;

import com.example.demo.model.Empaque;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PedidoInformeDto {
    private Integer pedidoId;
    private Date fechaPedido;
    private Double total;
    private List<Empaque> empaques;
}
