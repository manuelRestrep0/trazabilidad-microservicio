package com.pragma.trazabilidad.adapters.driving.http.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LogPedidoDto {
    private Long idPedido;
    private Long idCliente;
    private String correoCliente;
    private String estadoAnterior;
    private String estadoNuevo;
    private Long idEmpleado;
    private String correoEmpleado;
}
