package com.pragma.trazabilidad.adapters.driven.mongodb.repository;

import com.pragma.trazabilidad.adapters.driven.mongodb.document.LogsPedidos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogsPedidosRepository extends MongoRepository<LogsPedidos,Long> {

}
