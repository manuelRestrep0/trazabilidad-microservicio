package com.pragma.trazabilidad.domain.model;

import java.time.LocalDate;

public class LogPedido {
    private Long idPedido;
    private Long idCliente;
    private String correoCliente;
    private LocalDate fecha;
    private String estadoAnterior;
    private String estadoNuevo;
    private Long idEmpleado;
    private String correoEmpleado;

    public LogPedido() {
    }
    public LogPedido(Long idPedido, Long idCliente, String correoCliente, LocalDate fecha, String estadoAnterior, String estadoNuevo, Long idEmpleado, String correoEmpleado) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.correoCliente = correoCliente;
        this.fecha = fecha;
        this.estadoAnterior = estadoAnterior;
        this.estadoNuevo = estadoNuevo;
        this.idEmpleado = idEmpleado;
        this.correoEmpleado = correoEmpleado;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstadoAnterior() {
        return estadoAnterior;
    }

    public void setEstadoAnterior(String estadoAnterior) {
        this.estadoAnterior = estadoAnterior;
    }

    public String getEstadoNuevo() {
        return estadoNuevo;
    }

    public void setEstadoNuevo(String estadoNuevo) {
        this.estadoNuevo = estadoNuevo;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }
}
