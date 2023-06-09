package com.pragma.trazabilidad.adapters.driven.mongodb.repository;

import com.pragma.trazabilidad.adapters.driven.mongodb.document.LogPedidoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LogsPedidosRepository extends MongoRepository<LogPedidoEntity,Long> {

    List<LogPedidoEntity> findAllByIdPedido(Long idPedido);
    LogPedidoEntity findByIdPedidoAndEstadoNuevo(Long idPedido, String estado);

}
