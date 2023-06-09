package com.pragma.trazabilidad.adapters.driven.mongodb.mapper;

import com.pragma.trazabilidad.adapters.driven.mongodb.document.LogPedidoEntity;
import com.pragma.trazabilidad.domain.model.LogPedido;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface LogPedidoEntityMapper {
    LogPedidoEntity toDocument(LogPedido logPedido);
    LogPedido toLogPedido(LogPedidoEntity logPedidoEntity);
}
