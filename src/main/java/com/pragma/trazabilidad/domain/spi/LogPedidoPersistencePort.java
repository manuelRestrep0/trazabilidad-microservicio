package com.pragma.trazabilidad.domain.spi;

import com.pragma.trazabilidad.domain.model.LogPedido;

import java.util.List;

public interface LogPedidoPersistencePort {
    void generarLog(LogPedido logPedido);
    List<LogPedido> obtenerLogsPedido(Long idPedido);
    LogPedido obtenerLogPedidoPorEstado(Long idPedido, String estado);
}
