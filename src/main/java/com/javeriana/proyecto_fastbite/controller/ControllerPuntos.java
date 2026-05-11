package com.javeriana.proyecto_fastbite.controller;

public class ControllerPuntos {
    double valorPunto = 1000.0;

    public ControllerPuntos(double valorPunto) {
        this.valorPunto = valorPunto;
    }
    /*--
            + consultarSaldo(idCliente: int) : int
    + verificarSuficiencia(idCliente: int, cantidad: int) : boolean
    + calcularDescuento(cantidad: int) : double
    + descontarPuntos(idCliente: int, cantidad: int) : void
    + aplicarDescuentoPedido(idPedido: int, descuento: double) : void
    */

    public double getValorPunto() {
        return valorPunto;
    }

    public void setValorPunto(double valorPunto) {
        this.valorPunto = valorPunto;
    }
}
