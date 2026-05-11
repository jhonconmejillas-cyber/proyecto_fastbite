package com.javeriana.proyecto_fastbite.controller;
public class ControllerPago {
     private int intentosPago;

    public ControllerPago(int intentosPago) {
        this.intentosPago = intentosPago;
    }
     /*--
            + procesarPago(metodo: String, total: double) : boolean
    + manejarPagoRechazado() : void
    + dispararGeneracionFactura(pedido: Pedido) : void
    + registrarTransaccion(metodo: String, total: double) : void
    */

    public int getIntentosPago() {
        return intentosPago;
    }

    public void setIntentosPago(int intentosPago) {
        this.intentosPago = intentosPago;
    }
}
