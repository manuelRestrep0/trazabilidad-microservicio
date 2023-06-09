package com.pragma.trazabilidad.adapters.driving.http.controller;

import com.pragma.trazabilidad.adapters.driving.http.dto.LogPedidoDto;
import com.pragma.trazabilidad.adapters.driving.http.handler.LogsPedidoHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/logs/pedidos")
@RequiredArgsConstructor
public class LogsController {
    private final LogsPedidoHandler pedidoHandler;

    @PostMapping("/registro")
    public ResponseEntity<Map<String,String>> crearRegistro(@RequestBody LogPedidoDto pedidoDto){
        pedidoHandler.generarLog(pedidoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                Collections.singletonMap("Mensaje: ","log guardado")
        );
    }
    @GetMapping("/tiempo-pedido/{idPedido}")
    public Long obtenerTiempoPedido(@PathVariable("idPedido") Long idPedido){
        return pedidoHandler.tiempoPedido(idPedido);
    }

}
