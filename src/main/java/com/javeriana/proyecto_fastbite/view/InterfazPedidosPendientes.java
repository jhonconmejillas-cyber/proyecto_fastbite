package com.javeriana.proyecto_fastbite.view;

import com.fastbite.Models.Pedido;

import java.util.ArrayList;

public class InterfazPedidosPendientes {
    private ArrayList<Pedido> listaPendientes;

    public InterfazPedidosPendientes(ArrayList<Pedido> listaPendientes) {
        this.listaPendientes = listaPendientes;
    }
    /*--
            + mostrarPedidosPendientes(lista: List) : void
    + seleccionarPedido(idPedido: int) : void
    + notificarCambioEstado(idPedido: int, estado: String) : void
    + mostrarError(mensaje: String) : void

     */

    public ArrayList<Pedido> getListaPendientes() {
        return listaPendientes;
    }

    public void setListaPendientes(ArrayList<Pedido> listaPendientes) {
        this.listaPendientes = listaPendientes;
    }
}