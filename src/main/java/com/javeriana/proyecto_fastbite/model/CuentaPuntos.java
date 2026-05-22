package com.javeriana.proyecto_fastbite.model;

import java.util.ArrayList;
import java.util.UUID;

public class CuentaPuntos {
    private UUID idCuenta;
    private int  saldoActual;

    public CuentaPuntos( UUID idCuenta, int saldoActual) {
        this.idCuenta = UUID.randomUUID();
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



    public UUID getIdCuenta() {
        return idCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }


    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setIdCuenta(UUID idCuenta) {
        this.idCuenta = idCuenta;
    }
}
