package com.pragma.trazabilidad.domain.usecase;

import com.pragma.trazabilidad.domain.api.LogPedidoServicePort;
import com.pragma.trazabilidad.domain.model.LogPedido;
import com.pragma.trazabilidad.domain.spi.LogPedidoPersistencePort;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class LogPedidoUseCase implements LogPedidoServicePort {

    private final LogPedidoPersistencePort logPedidoPersistencePort;

    public LogPedidoUseCase(LogPedidoPersistencePort logPedidoPersistencePort) {
        this.logPedidoPersistencePort = logPedidoPersistencePort;
    }
    @Override
    public void generarLog(LogPedido logPedido) {
        logPedido.setFecha(LocalDateTime.now());

        logPedidoPersistencePort.generarLog(logPedido);
    }
    @Override
    public Long tiempoPedido(Long idPedido) {
        LocalDateTime fechaLogPedidoPendiente = logPedidoPersistencePort.obtenerLogPedidoPorEstado(idPedido,"En preparacion").getFecha();
        LocalDateTime fechaLogPedidoEntregado = logPedidoPersistencePort.obtenerLogPedidoPorEstado(idPedido,"Entregado").getFecha();
        Duration duration = Duration.between(fechaLogPedidoPendiente,fechaLogPedidoEntregado);
        return duration.toMinutes();
    }

    @Override
    public List<LogPedido> obtenerLogsPedido(Long idPedido) {
        return logPedidoPersistencePort.obtenerLogsPedido(idPedido);
    }
}
