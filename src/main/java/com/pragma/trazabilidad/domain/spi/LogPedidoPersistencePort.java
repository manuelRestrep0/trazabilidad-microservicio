package com.pragma.trazabilidad.domain.spi;

import com.pragma.trazabilidad.domain.model.LogPedido;

public interface LogPedidoPersistencePort {
    void generarLog(LogPedido logPedido);
}
