package com.javeriana.proyecto_fastbite.model;


import java.util.UUID;

public class Cocinero extends Usuario {
    public Cocinero(String contrasena, UUID idUsuario, String nombre, String usuarioType) {
        super(contrasena, idUsuario, nombre, usuarioType);
    }
}