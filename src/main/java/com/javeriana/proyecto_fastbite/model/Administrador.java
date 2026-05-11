package com.javeriana.proyecto_fastbite.model;

import java.util.UUID;

public class Administrador {
    private UUID idAdministrador;
    private  String nombre;
    private String  usuario;
    private String contrasena;

    public Administrador(String contrasena, UUID idAdministrador, String nombre, String usuario) {
        this.idAdministrador = UUID.randomUUID();
        this.contrasena = contrasena;
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.usuario = usuario;
    }
    /*
    public iniciarSesion(usuario: String, contrasena: String){

    }
    public  void cerrarSesion(){

    }
    public  void gestionarPersonal(){

    }
    public  void generarReporte(tipo: String){

    }
    public  String obtenerRol(){

    }
        */
    //-----------------------------------------------------------------
    public String getContrasena() {
        return contrasena;
    }

    public UUID getIdAdministrador() {
        return idAdministrador;
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
