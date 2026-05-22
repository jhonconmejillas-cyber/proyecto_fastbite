package com.javeriana.proyecto_fastbite.model;

import java.util.UUID;

    public abstract class Usuario {

        protected UUID idUsuario;

        protected String nombre;

        protected String usuarioType;

        protected String contrasena;

        public Usuario(String contrasena, UUID idUsuario, String nombre, String usuarioType) {
            this.contrasena = contrasena;
            this.idUsuario = idUsuario;
            this.nombre = nombre;
            this.usuarioType = usuarioType;
        }

        public String getContrasena() {
            return contrasena;
        }

        public UUID getIdUsuario() {
            return idUsuario;
        }

        public String getNombre() {
            return nombre;
        }

        public String getUsuarioType() {
            return usuarioType;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }

        public void setIdUsuario(UUID idUsuario) {
            this.idUsuario = idUsuario;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setUsuarioType(String usuarioType) {
            this.usuarioType = usuarioType;
        }
    }
