package com.javeriana.proyecto_fastbite.view;

import com.fastbite.Models.Factura;

public class InterfazFactura {
    private Factura facturaActual;

    public InterfazFactura(Factura facturaActual) {
        this.facturaActual = facturaActual;
    }
    /*--
            + recibirFactura(factura: Factura) : void
    + enviarAImpresion(factura: Factura) : void
    + mostrarConfirmacion() : void
    */

    public Factura getFacturaActual() {
        return facturaActual;
    }

    public void setFacturaActual(Factura facturaActual) {
        this.facturaActual = facturaActual;
    }
}
