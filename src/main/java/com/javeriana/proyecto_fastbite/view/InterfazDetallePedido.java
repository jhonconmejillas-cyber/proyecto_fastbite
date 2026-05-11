package com.javeriana.proyecto_fastbite.view;

import com.fastbite.Models.Pedido;

public class InterfazDetallePedido {
    private Pedido pedidoActual;

    public InterfazDetallePedido(Pedido pedidoActual) {
        this.pedidoActual = pedidoActual;
    }
    /*--
     + mostrarDetallePedido(detalle: Pedido) : void
    + cambiarEstado(estado: String) : void
    + marcarComoListo(idPedido: int) : void
    + mostrarConfirmacion(mensaje: String) : void
    */

    public Pedido getPedidoActual() {
        return pedidoActual;
    }

    public void setPedidoActual(Pedido pedidoActual) {
        this.pedidoActual = pedidoActual;
    }
}
