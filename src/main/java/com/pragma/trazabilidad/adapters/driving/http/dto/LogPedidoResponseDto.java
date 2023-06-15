package com.pragma.trazabilidad.adapters.driving.http.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class LogPedidoResponseDto {
    private Long idPedido;
    private LocalDateTime fecha;
    private String estadoAnterior;
    private String estadoNuevo;
}
