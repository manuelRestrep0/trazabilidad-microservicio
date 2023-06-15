package com.pragma.trazabilidad.adapters.driving.http.handler.impl;

import com.pragma.trazabilidad.adapters.driving.http.dto.LogPedidoDto;
import com.pragma.trazabilidad.adapters.driving.http.dto.LogPedidoResponseDto;
import com.pragma.trazabilidad.adapters.driving.http.handler.LogsPedidoHandler;
import com.pragma.trazabilidad.adapters.driving.http.mapper.LogPedidoDtoMapper;
import com.pragma.trazabilidad.adapters.driving.http.mapper.LogPedidoResponseDtoMapper;
import com.pragma.trazabilidad.domain.api.LogPedidoServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LogsPedidoHandlerImpl implements LogsPedidoHandler {
    private final LogPedidoServicePort logPedidoServicePort;
    private final LogPedidoDtoMapper pedidoDtoMapper;
    private final LogPedidoResponseDtoMapper logPedidoResponseDtoMapper;
    @Override
    public void generarLog(LogPedidoDto pedidoDto) {
        logPedidoServicePort.generarLog(pedidoDtoMapper.toLogPedido(pedidoDto));
    }

    @Override
    public Long tiempoPedido(Long idPedido) {
        return logPedidoServicePort.tiempoPedido(idPedido);
    }

    @Override
    public List<LogPedidoResponseDto> obtenerLogs(Long idPedido) {
        List<LogPedidoResponseDto> response = new ArrayList<>();

        logPedidoServicePort.obtenerLogsPedido(idPedido).forEach(logPedido -> response.add(logPedidoResponseDtoMapper.toResponse(logPedido)));
        return response;
    }
}
