package com.javeriana.proyecto_fastbite.model;

import java.util.UUID;

public class DetallePedido {
    private UUID idDetalle;

    private UUID idPedido;

    private UUID idProducto;

    private int cantidad;

    private double subtotal;

    public DetallePedido(UUID idPedido,
                         UUID idProducto,
                         int cantidad,
                         double subtotal) {

        this.idDetalle = UUID.randomUUID();

        this.idPedido = idPedido;

        this.idProducto = idProducto;

        this.cantidad = cantidad;

        this.subtotal = subtotal;

    }

    // Leer csv
    public DetallePedido(UUID idDetalle,
                         UUID idPedido,
                         UUID idProducto,
                         int cantidad,
                         double subtotal) {

        this.idDetalle = idDetalle;

        this.idPedido = idPedido;

        this.idProducto = idProducto;

        this.cantidad = cantidad;

        this.subtotal = subtotal;

    }

    public int getCantidad() {
        return cantidad;
    }

    public UUID getIdDetalle() {
        return idDetalle;
    }

    public UUID getIdPedido() {
        return idPedido;
    }

    public UUID getIdProducto() {
        return idProducto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setIdDetalle(UUID idDetalle) {
        this.idDetalle = idDetalle;
    }

    public void setIdPedido(UUID idPedido) {
        this.idPedido = idPedido;
    }

    public void setIdProducto(UUID idProducto) {
        this.idProducto = idProducto;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
