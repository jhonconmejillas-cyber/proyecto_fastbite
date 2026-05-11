package com.javeriana.proyecto_fastbite.controller;

import com.javeriana.proyecto_fastbite.model.Catalogo;
import com.javeriana.proyecto_fastbite.model.Producto;

public class ControllerCatalogo {
    private Catalogo catalogo;
    private Producto producto;

    public ControllerCatalogo(Catalogo catalogo, Producto producto) {
        this.catalogo = catalogo;
        this.producto = producto;
    }

    /*
            + solicitarListaProductos() : List
        + validarDatos(nombre: String, precio: double) : boolean
        + crearProducto(nombre: String, precio: double, descripcion: String) : void
        + editarProducto(idProducto: int, nuevosDatos: Producto) : void
        + eliminarProducto(idProducto: int) : void
        + refrescarCatalogo() : void
        */
    
    public void crearProducto(String nombre,  double precio,  String descripcion){
        Producto p = producto.crearProducto(nombre, precio, descripcion);
        catalogo.agregarProducto(p);
    }
}
