package com.example.demo.service.impl;

import com.example.demo.model.Logistica;
import com.example.demo.repository.LogisticaRepository;
import com.example.demo.service.ILogisticaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class LogisticaService implements ILogisticaService {
    private LogisticaRepository logisticaRepository;

    @Override
    public Logistica actualizarEstadoLogistica(String estadoEnvio, String idlogistica) {
        Logistica logistica = logisticaRepository.findById(Integer.valueOf(idlogistica))
                .orElseThrow(() -> new RuntimeException("Logística no encontrada"));

        logistica.setEstadoEnvio(estadoEnvio);
        return logisticaRepository.save(logistica);
    }
}
