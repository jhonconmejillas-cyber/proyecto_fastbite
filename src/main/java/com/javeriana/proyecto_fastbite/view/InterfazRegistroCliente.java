package com.javeriana.proyecto_fastbite.view;

public class InterfazRegistroCliente {
    private String nombre;
    private String email;
     private String telefono;

    public InterfazRegistroCliente(String email, String nombre, String telefono) {
        this.email = email;
        this.nombre = nombre;
        this.telefono = telefono;
    }
     /*--
            + mostrarFormulario() : void
    + ingresarDatos(nombre: String, email: String, telefono: String) : void
    + enviarDatos() : void
    + mostrarExito(mensaje: String) : void
    + mostrarError(mensaje: String) : void
    */

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

