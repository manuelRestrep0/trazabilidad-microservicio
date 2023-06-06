package com.pragma.trazabilidad.adapters.driving.http.handler;

import com.pragma.trazabilidad.adapters.driving.http.dto.LogPedidoDto;

public interface LogsPedidoHandler {

    void generarLog(LogPedidoDto pedidoDto);
}
