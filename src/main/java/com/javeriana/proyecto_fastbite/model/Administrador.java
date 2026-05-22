package com.javeriana.proyecto_fastbite.model;

import java.util.UUID;

public class Administrador extends Usuario {
    public Administrador(UUID idUsuario, String nombre,String usuarioType,String contrasena) {
        super( contrasena, idUsuario,nombre,usuarioType);
    }
}