package com.javeriana.proyecto_fastbite.view;

import com.fastbite.controllers.ControllerCatalogo;
import com.fastbite.Models.Producto;

import java.util.ArrayList;

public class InterfazGestionProducto {
    private ArrayList<Producto> listaProductos;
    private ControllerCatalogo controllerCatalogo;

    public InterfazGestionProducto(ArrayList<Producto> listaProductos,ControllerCatalogo controllerCatalogo) {
        this.listaProductos = listaProductos;
       this.controllerCatalogo = new ControllerCatalogo(listaProductos);
    }
    /*--

    + seleccionarOperacion(operacion: String) : void
    + seleccionarProducto(idProducto: int) : void
    + mostrarExito(mensaje: String) : void
    + mostrarError(mensaje: String) : void
    */
    public void  mostrarListaProductos(){
        controllerCatalogo.mostrarMenu();
    }
    //------------------------------
    public ArrayList getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList listaProductos) {
        this.listaProductos = listaProductos;
    }
}
