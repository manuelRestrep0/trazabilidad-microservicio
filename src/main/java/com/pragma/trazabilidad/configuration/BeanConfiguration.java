package com.pragma.trazabilidad.configuration;

import com.pragma.trazabilidad.adapters.driven.mongodb.adapter.LogsPedidosMongodbAdapter;
import com.pragma.trazabilidad.adapters.driven.mongodb.mapper.LogPedidoEntityMapper;
import com.pragma.trazabilidad.adapters.driven.mongodb.repository.LogsPedidosRepository;
import com.pragma.trazabilidad.domain.api.LogPedidoServicePort;
import com.pragma.trazabilidad.domain.spi.LogPedidoPersistencePort;
import com.pragma.trazabilidad.domain.usecase.LogPedidoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final LogsPedidosRepository logsPedidosRepository;
    private final LogPedidoEntityMapper logPedidoEntityMapper;

    @Bean
    public LogPedidoServicePort logPedidoServicePort(){
        return new LogPedidoUseCase(logPedidoPersistencePort());
    }

    @Bean
    public LogPedidoPersistencePort logPedidoPersistencePort(){
        return new LogsPedidosMongodbAdapter(logsPedidosRepository, logPedidoEntityMapper);
    }
}
