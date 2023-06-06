package com.pragma.trazabilidad.adapters.driven.mongodb.adapter;

import com.pragma.trazabilidad.adapters.driven.mongodb.mapper.LogPedidoDocumentMapper;
import com.pragma.trazabilidad.adapters.driven.mongodb.repository.LogsPedidosRepository;
import com.pragma.trazabilidad.domain.model.LogPedido;
import com.pragma.trazabilidad.domain.spi.LogPedidoPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LogsPedidosMongodbAdapter implements LogPedidoPersistencePort {

    private final LogsPedidosRepository logsPedidosRepository;
    private final LogPedidoDocumentMapper logPedidoDocumentMapper;

    @Override
    public void generarLog(LogPedido logPedido) {
        logsPedidosRepository.save(logPedidoDocumentMapper.toDocument(logPedido));
    }
}
