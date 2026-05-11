package com.javeriana.proyecto_fastbite.view;

import com.fastbite.Models.Producto;

import java.util.ArrayList;

public class InterfazRegistrarProducto {
    private ArrayList<Producto> productosSeleccionados;
    private double totalMostrado;

    public InterfazRegistrarProducto(ArrayList<Producto> productosSeleccionados, double totalMostrado) {
        this.productosSeleccionados = productosSeleccionados;
        this.totalMostrado = totalMostrado;
    }
    /*
            + mostrarMenuProductos() : void
    + seleccionarProducto(idProducto: int) : void
    + ingresarCantidad(cantidad: int) : void
    + mostrarResumenPedido(total: double) : void
    + confirmarPedido() : void
    + mostrarError(mensaje: String) : void
    */

    public ArrayList<Producto> getProductosSeleccionados() {
        return productosSeleccionados;
    }

    public double getTotalMostrado() {
        return totalMostrado;
    }

    public void setProductosSeleccionados(ArrayList<Producto> productosSeleccionados) {
        this.productosSeleccionados = productosSeleccionados;
    }

    public void setTotalMostrado(double totalMostrado) {
        this.totalMostrado = totalMostrado;
    }
}
