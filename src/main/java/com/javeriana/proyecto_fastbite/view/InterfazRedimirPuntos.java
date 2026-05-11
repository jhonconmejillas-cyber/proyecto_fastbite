package com.javeriana.proyecto_fastbite.view;

public class InterfazRedimirPuntos {
   private int  saldoPuntos;
    private int cantidadARedimir;

    public InterfazRedimirPuntos(int cantidadARedimir, int saldoPuntos) {
        this.cantidadARedimir = cantidadARedimir;
        this.saldoPuntos = saldoPuntos;
    }
    /*--
            + solicitarIdCliente() : void
    + mostrarSaldoPuntos(puntos: int) : void
    + ingresarPuntosARedimir(cantidad: int) : void
    + mostrarDescuentoAplicado(descuento: double, nuevoSaldo: int) : void
    + mostrarError(mensaje: String) : void
    */

    public int getCantidadARedimir() {
        return cantidadARedimir;
    }

    public int getSaldoPuntos() {
        return saldoPuntos;
    }

    public void setCantidadARedimir(int cantidadARedimir) {
        this.cantidadARedimir = cantidadARedimir;
    }

    public void setSaldoPuntos(int saldoPuntos) {
        this.saldoPuntos = saldoPuntos;
    }
}
