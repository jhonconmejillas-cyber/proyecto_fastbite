package com.javeriana.proyecto_fastbite.model;

import java.util.List;
import java.util.UUID;

public class Cliente {
    private  UUID idCliente;
     private String nombre ;
    private  String email;
    private String telefono;
    private  int saldoPuntos;
    private List<Pedido> pedidos;
    private CuentaPuntos cuentaPuntos;

    public Cliente(String email, UUID idCliente, String nombre, int saldoPuntos, String telefono) {
        this.idCliente = idCliente;
        this.email = email;
        this.nombre = nombre;
        this.saldoPuntos = saldoPuntos;
        this.telefono = telefono;
    }
    public Cliente(String email,String nombre, int saldoPuntos, String telefono) {
        this.idCliente = UUID.randomUUID();
        this.email = email;
        this.nombre = nombre;
        this.saldoPuntos = saldoPuntos;
        this.telefono = telefono;
    }

    /*
        + registrarCliente(nombre: String, email: String, telefono: String) : void
    + verificarEmailUnico(email: String) : boolean
    + obtenerSaldoPuntos() : int
    + actualizarDatos(nuevosDatos: Cliente) : void
    + buscarPorEmail(email: String) : Cliente

     */

    public String getEmail() {
        return email;
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSaldoPuntos() {
        return saldoPuntos;
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

    public void setSaldoPuntos(int saldoPuntos) {
        this.saldoPuntos = saldoPuntos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
