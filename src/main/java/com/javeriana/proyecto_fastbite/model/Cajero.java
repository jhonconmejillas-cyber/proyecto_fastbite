package com.javeriana.proyecto_fastbite.model;


import java.util.UUID;

public class Cajero extends Usuario {
    public Cajero(String contrasena, UUID idUsuario, String nombre, String usuarioType) {
        super(contrasena, idUsuario, nombre, usuarioType);
    }
}