package com.pragma.trazabilidad.adapters.driving.http.handler;

import com.pragma.trazabilidad.adapters.driving.http.dto.LogPedidoDto;
import com.pragma.trazabilidad.adapters.driving.http.dto.LogPedidoResponseDto;

import java.util.List;

public interface LogsPedidoHandler {

    void generarLog(LogPedidoDto pedidoDto);
    Long tiempoPedido(Long idPedido);
    List<LogPedidoResponseDto> obtenerLogs(Long idPedido);
}
