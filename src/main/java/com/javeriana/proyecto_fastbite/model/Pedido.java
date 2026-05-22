package com.javeriana.proyecto_fastbite.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Pedido {
    private UUID idPedido;
    private LocalDateTime fechaHora;
    private String Estado;
    private double subtotal;
    private double iva;
    private double total;
    private Cliente cliente;
    private Factura factura;



    public Pedido(String estado, LocalDateTime fechaHora, UUID idPedido, double iva, double subtotal, double total) {
        this.idPedido = UUID.randomUUID();
        Estado = estado;
        this.fechaHora = fechaHora;
        this.idPedido = idPedido;
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
    }

/*
    public void crearPedido(){

    }
     public double calcularTotal(){

     }
    public void  cambiarEstado(){

    }
    public Pedido obtenerDetalle(){

    }
     public String obtenerEstado(){

    }
    */

    public String getEstado() {
        return Estado;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public UUID getIdPedido() {
        return idPedido;
    }

    public double getIva() {
        return iva;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setIdPedido(UUID idPedido) {
        this.idPedido = idPedido;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
