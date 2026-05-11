package com.javeriana.proyecto_fastbite.model;

import java.util.ArrayList;
import java.util.UUID;

public class CuentaPuntos {
    private UUID idCuenta;
    private int  saldoActual;
    ArrayList <Integer> historialMovimientos;

    public CuentaPuntos(ArrayList<Integer> historialMovimientos, UUID idCuenta, int saldoActual) {
        this.idCuenta = UUID.randomUUID();
        this.historialMovimientos = historialMovimientos;
        this.idCuenta = idCuenta;
        this.saldoActual = saldoActual;
    }
    /*
         + consultarSaldo(idCliente: int) : int
    + acreditarPuntos(idCliente: int, puntos: int) : void
    + descontarPuntos(idCliente: int, puntos: int) : void
    + verificarSuficiencia(cantidad: int) : boolean
    + obtenerHistorial(idCliente: int) : List
     */

    public ArrayList<Integer> getHistorialMovimientos() {
        return historialMovimientos;
    }

    public UUID getIdCuenta() {
        return idCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setHistorialMovimientos(ArrayList<Integer> historialMovimientos) {
        this.historialMovimientos = historialMovimientos;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
}
