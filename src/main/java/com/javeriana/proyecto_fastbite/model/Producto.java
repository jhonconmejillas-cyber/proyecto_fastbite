package com.javeriana.proyecto_fastbite.model;

import java.util.UUID;
/*
idProducto,nombre,precio,descripcion,disponible
550e8400-e29b-41d4-a716-446655440000,Hamburguesa Clasica,15000,Hamburguesa con carne y queso,true
550e8400-e29b-41d4-a716-446655440001,Hamburguesa Doble,22000,Doble carne con queso cheddar,true
550e8400-e29b-41d4-a716-446655440002,Pizza Pepperoni,25000,Pizza mediana con pepperoni,true
550e8400-e29b-41d4-a716-446655440003,Pizza Hawaiana,26000,Pizza con piña y jamon,false
550e8400-e29b-41d4-a716-446655440004,Perro Caliente,12000,Pan con salchicha y salsas,true
550e8400-e29b-41d4-a716-446655440005,Salchipapas,14000,Papas fritas con salchicha,true
550e8400-e29b-41d4-a716-446655440006,Papas Fritas,8000,Acompañamiento clasico,true
550e8400-e29b-41d4-a716-446655440007,Alitas BBQ,18000,Alitas bañadas en salsa BBQ,true
550e8400-e29b-41d4-a716-446655440008,Nuggets Pollo,13000,Trozos de pollo apanado,true
550e8400-e29b-41d4-a716-446655440009,Gaseosa Personal,5000,Bebida fria 400ml,true
550e8400-e29b-41d4-a716-446655440010,Gaseosa Litro,9000,Bebida fria 1 litro,true
550e8400-e29b-41d4-a716-446655440011,Jugo Natural,7000,Jugo de fruta natural,true
550e8400-e29b-41d4-a716-446655440012,Cerveza,8000,Bebida alcoholica,false
550e8400-e29b-41d4-a716-446655440013,Agua,3000,Agua sin gas,true
550e8400-e29b-41d4-a716-446655440014,Ensalada Cesar,16000,Ensalada con pollo y aderezo,true
550e8400-e29b-41d4-a716-446655440015,Arepa con Queso,6000,Arepa asada con queso,true
550e8400-e29b-41d4-a716-446655440016,Empanadas,4000,Empanadas fritas,true
550e8400-e29b-41d4-a716-446655440017,Combo Hamburguesa,28000,Hamburguesa papas y gaseosa,true
550e8400-e29b-41d4-a716-446655440018,Combo Pizza,35000,Pizza mas bebida,true
550e8400-e29b-41d4-a716-446655440019,Postre Helado,9000,Helado de vainilla con topping,true
 */
public class Producto {
     private UUID idProducto;
    private String nombre;
    private  double precio;
    private String descripcion;
    private  boolean disponible;

    public Producto(String descripcion, boolean disponible, String nombre, double precio) {
        this.idProducto = UUID.randomUUID();
        this.descripcion = descripcion;
        this.disponible = disponible;
        this.nombre = nombre;
        this.precio = precio;
    }
    /*
     crearProducto(nombre: String, precio: double, descripcion: String) : void
    + actualizarProducto(nuevosDatos: Producto) : void
    + eliminarProducto() : void
    + verificarDisponibilidad() : boolean
    + obtenerPrecio() : double
     */

    public Producto crearProducto( String nombre,  double precio,  String descripcion){
        Producto p =  new Producto(descripcion,true ,nombre,precio);
                return p;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public UUID getIdProducto() {
        return idProducto;
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

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
