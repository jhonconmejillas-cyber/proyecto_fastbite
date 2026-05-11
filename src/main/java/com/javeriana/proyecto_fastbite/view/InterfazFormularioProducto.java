package com.javeriana.proyecto_fastbite.view;

public class InterfazFormularioProducto {
     private String  nombre;
    private double  precio;
    private String  descripcion ;

    public InterfazFormularioProducto(String descripcion, String nombre, double precio) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
    }
    /*--
            + abrirFormularioCreacion() : void
    + abrirFormularioEdicion(datos: Producto) : void
    + ingresarDatos(nombre: String, precio: double, descripcion: String) : void
    + enviarDatos() : void
    + mostrarError(mensaje: String) : void
    */

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
