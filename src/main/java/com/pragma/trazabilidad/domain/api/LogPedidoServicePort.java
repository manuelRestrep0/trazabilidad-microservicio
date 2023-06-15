package com.pragma.trazabilidad.domain.api;

import com.pragma.trazabilidad.domain.model.LogPedido;

import java.util.List;

public interface LogPedidoServicePort {
    void generarLog(LogPedido logPedido);
    Long tiempoPedido(Long idPedido);
    List<LogPedido> obtenerLogsPedido(Long idPedido);
}
