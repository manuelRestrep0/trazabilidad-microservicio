package com.pragma.trazabilidad.domain.api;

import com.pragma.trazabilidad.domain.model.LogPedido;

public interface LogPedidoServicePort {
    void generarLog(LogPedido logPedido);
    Long tiempoPedido(Long idPedido);
}
