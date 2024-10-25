package com.example.demo.controller;

import com.example.demo.model.Logistica;
import com.example.demo.service.ILogisticaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "api/v1/logistica")
public class LogisticaController {
    private final ILogisticaService logisticaService;

    @PutMapping("/actualizarEstado/{id}")
    public ResponseEntity<Logistica> actualizarEstado(@PathVariable Integer id, @RequestParam String estadoActivo) {
        Logistica logisticaActualizada = logisticaService.actualizarEstadoLogistica(String.valueOf(id), estadoActivo);
        return new ResponseEntity<>(logisticaActualizada, HttpStatus.OK);
    }

}
