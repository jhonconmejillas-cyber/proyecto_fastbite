package com.javeriana.proyecto_fastbite.model;

import java.util.ArrayList;
import java.util.UUID;

public class Catalogo {
    private UUID idCatalogo;
    private ArrayList<Producto> listaProductos;

    public Catalogo(ArrayList<Producto> listaProductos) {
        this.idCatalogo = UUID.randomUUID();
        this.listaProductos = listaProductos;
    }

    /*
         agregarProducto(producto: Producto) : void
    + removerProducto(idProducto: int) : void
    + obtenerProductos() : List
    + buscarProducto(idProducto: int) : Producto
    + refrescarCatalogo() : void

     */

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }
    public UUID getIdCatalogo() {
        return idCatalogo;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setIdCatalogo(UUID idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
