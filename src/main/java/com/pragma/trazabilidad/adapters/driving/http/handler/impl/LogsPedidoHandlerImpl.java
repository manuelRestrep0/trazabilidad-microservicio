package com.pragma.trazabilidad.adapters.driving.http.handler.impl;

import com.pragma.trazabilidad.adapters.driving.http.dto.LogPedidoDto;
import com.pragma.trazabilidad.adapters.driving.http.handler.LogsPedidoHandler;
import com.pragma.trazabilidad.adapters.driving.http.mapper.LogPedidoDtoMapper;
import com.pragma.trazabilidad.domain.api.LogPedidoServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogsPedidoHandlerImpl implements LogsPedidoHandler {
    private final LogPedidoServicePort logPedidoServicePort;
    private final LogPedidoDtoMapper pedidoDtoMapper;
    @Override
    public void generarLog(LogPedidoDto pedidoDto) {
        logPedidoServicePort.generarLog(pedidoDtoMapper.toLogPedido(pedidoDto));
    }

    @Override
    public Long tiempoPedido(Long idPedido) {
        return logPedidoServicePort.tiempoPedido(idPedido);
    }
}
