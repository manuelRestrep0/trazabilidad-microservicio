package com.pragma.trazabilidad.adapters.driven.mongodb.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Document(collection = "logs-pedidos")
public class LogsPedidos {
    @Id
    private Long id;
    private Long idPedido;
    private Long idCliente;
    private String correoCliente;
    private LocalDate fecha;
    private String estadoAnterior;
    private String estadoNuevo;
    private Long idEmpleado;
    private String correoEmpleado;
}
