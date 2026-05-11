package com.javeriana.proyecto_fastbite.model;

import java.util.UUID;

public class Cocinero {
    private UUID idCocinero;
    private String nombre;
    private String  usuario;
    private String contrasena;

    /*            --
            + iniciarSesion(usuario: String, contrasena: String) : boolean
    + cerrarSesion() : void
    + verPedidosPendientes() : List
    + actualizarEstadoPedido(idPedido: int, estado: String) : void
    + obtenerRol() : String
    */

    public String getContrasena() {
        return contrasena;
    }

    public UUID getIdCocinero() {
        return idCocinero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

