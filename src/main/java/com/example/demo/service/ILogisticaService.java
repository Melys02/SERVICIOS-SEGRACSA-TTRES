package com.example.demo.service;

import com.example.demo.model.Logistica;

public interface ILogisticaService {

    Logistica actualizarEstadoLogistica(String estadoEnvio, String idlogistica);
}
