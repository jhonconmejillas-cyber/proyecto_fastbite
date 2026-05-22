package com.javeriana.proyecto_fastbite.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Catalogo {
    private UUID idCatalogo;
    private List<Producto> listaProductos;

    public Catalogo(List<Producto> listaProductos) {
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

    public List<Producto> getListaProductos() {
        return listaProductos;
    }
    public void setIdCatalogo(UUID idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
