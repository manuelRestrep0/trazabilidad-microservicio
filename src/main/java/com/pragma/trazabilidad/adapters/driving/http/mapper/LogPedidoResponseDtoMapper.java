package com.pragma.trazabilidad.adapters.driving.http.mapper;

import com.pragma.trazabilidad.adapters.driving.http.dto.LogPedidoResponseDto;
import com.pragma.trazabilidad.domain.model.LogPedido;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy =  ReportingPolicy.IGNORE)
public interface LogPedidoResponseDtoMapper {
    LogPedidoResponseDto toResponse(LogPedido logPedido);
}
