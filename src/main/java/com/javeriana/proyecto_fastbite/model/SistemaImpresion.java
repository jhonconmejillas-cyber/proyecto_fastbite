package com.javeriana.proyecto_fastbite.model;

import java.util.UUID;

public class SistemaImpresion {
    private UUID  idSistema;
    private String  estado;
    private String impresora;

    public SistemaImpresion(String estado, int idSistema, String impresora) {
        this.idSistema = UUID.randomUUID();
        this.estado = estado;
        this.impresora = impresora;
    }
    /*    --
            + recibirFactura(factura: Factura) : void
    + imprimirFactura(factura: Factura) : void
    + verificarEstado() : boolean
    + confirmarImpresion() : void
        */

}
