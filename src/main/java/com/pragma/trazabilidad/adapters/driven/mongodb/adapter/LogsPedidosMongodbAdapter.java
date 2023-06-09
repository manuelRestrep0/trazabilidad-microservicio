package com.pragma.trazabilidad.adapters.driven.mongodb.adapter;

import com.pragma.trazabilidad.adapters.driven.mongodb.document.LogPedidoEntity;
import com.pragma.trazabilidad.adapters.driven.mongodb.mapper.LogPedidoEntityMapper;
import com.pragma.trazabilidad.adapters.driven.mongodb.repository.LogsPedidosRepository;
import com.pragma.trazabilidad.domain.model.LogPedido;
import com.pragma.trazabilidad.domain.spi.LogPedidoPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class LogsPedidosMongodbAdapter implements LogPedidoPersistencePort {

    private final LogsPedidosRepository logsPedidosRepository;
    private final LogPedidoEntityMapper logPedidoEntityMapper;

    @Override
    public void generarLog(LogPedido logPedido) {
        logsPedidosRepository.save(logPedidoEntityMapper.toDocument(logPedido));

    }
    @Override
    public List<LogPedido> obtenerLogsPedido(Long idPedido) {
        List<LogPedidoEntity> logPedidoEntityList = logsPedidosRepository.findAllByIdPedido(idPedido);
        List<LogPedido> logsPedido = new ArrayList<>();
        logPedidoEntityList.forEach(logPedidoEntity -> logsPedido.add(logPedidoEntityMapper.toLogPedido(logPedidoEntity)));
        return logsPedido;
    }
    @Override
    public LogPedido obtenerLogPedidoPorEstado(Long idPedido, String estado) {
        return logPedidoEntityMapper.toLogPedido(logsPedidosRepository.findByIdPedidoAndEstadoNuevo(idPedido,estado));
    }
}
