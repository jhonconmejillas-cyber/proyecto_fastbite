package com.javeriana.proyecto_fastbite.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Factura {
    private UUID idFactura;
    private LocalDateTime fechaEmision;
    private double subtotal;
    private double iva;
    private double total;
    private String metodoPago;

    public Factura(LocalDateTime fechaEmision, UUID idFactura, double iva, String metodoPago, double subtotal, double total) {
        this.idFactura = idFactura;
        this.fechaEmision = fechaEmision;
        this.idFactura = idFactura;
        this.iva = iva;
        this.metodoPago = metodoPago;
        this.subtotal = subtotal;
        this.total = total;
    }

    public Factura(LocalDateTime fechaEmision, double iva, String metodoPago, double subtotal ,double total) {

        this.idFactura = UUID.randomUUID();

        this.fechaEmision = fechaEmision;

        this.subtotal = subtotal;

        this.iva = iva;

        this.total = total;

        this.metodoPago = metodoPago;
    /*
     + crearFactura(pedido: Pedido, metodoPago: String) : void
    + calcularIVA(subtotal: double) : double
    + obtenerDetalle() : Factura
    + anularFactura() : void

     */


    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public UUID getIdFactura() {
        return idFactura;
    }

    public double getIva() {
        return iva;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setFechaEmision(LocalDateTime fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setIdFactura(UUID idFactura) {
        this.idFactura = idFactura;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}




