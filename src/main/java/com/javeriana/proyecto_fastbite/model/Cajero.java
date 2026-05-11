package com.javeriana.proyecto_fastbite.model;

import java.util.UUID;

public class Cajero {
  private UUID idCajero ;
    private String nombre ;
    private String usuario ;
    private String contrasena;

    public Cajero(String contrasena, String nombre, String usuario) {
        this.idCajero = UUID.randomUUID();
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.usuario = usuario;
    }
    /*
        + iniciarSesion(usuario: String, contrasena: String) : boolean
    + cerrarSesion() : void
    + registrarAccion(accion: String) : void
    + obtenerRol() : String
     */

    public String getContrasena() {
        return contrasena;
    }

    public UUID getIdCajero() {
        return idCajero;
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
