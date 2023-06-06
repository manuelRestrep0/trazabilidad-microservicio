package com.pragma.trazabilidad.domain.usecase;

import com.pragma.trazabilidad.domain.api.LogPedidoServicePort;
import com.pragma.trazabilidad.domain.model.LogPedido;
import com.pragma.trazabilidad.domain.spi.LogPedidoPersistencePort;

import java.time.LocalDate;

public class LogPedidoUseCase implements LogPedidoServicePort {

    private final LogPedidoPersistencePort logPedidoPersistencePort;

    public LogPedidoUseCase(LogPedidoPersistencePort logPedidoPersistencePort) {
        this.logPedidoPersistencePort = logPedidoPersistencePort;
    }
    @Override
    public void generarLog(LogPedido logPedido) {
        logPedido.setFecha(LocalDate.now());

    }
}
