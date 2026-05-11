package com.javeriana.proyecto_fastbite.view;

public class InterfazSeleccionPago {
     private  String metodoPago;

    public InterfazSeleccionPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
     /*--
            + mostrarMetodosPago() : void
    + ingresarMetodoPago(metodo: String) : void
    + mostrarResultadoPago(exito: boolean) : void
    + solicitarOtroMetodo() : void
    */

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}
