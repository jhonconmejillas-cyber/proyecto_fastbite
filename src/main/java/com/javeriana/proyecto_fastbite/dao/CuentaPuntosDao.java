package com.javeriana.proyecto_fastbite.dao;


import com.javeriana.proyecto_fastbite.model.CuentaPuntos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CuentaPuntosDao {

    private final String RUTA =
            "src/main/resources/data/cuenta_puntos.csv";

    public List<CuentaPuntos> leerCuentas() {

        List<CuentaPuntos> cuentas =
                new ArrayList<>();

        try(BufferedReader br =
                    Files.newBufferedReader(Paths.get(RUTA))) {

            String linea;

            br.readLine();

            while((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                UUID idCuenta =
                        UUID.fromString(datos[0]);

                int saldoActual =
                        Integer.parseInt(datos[1]);

                CuentaPuntos cuenta =
                        new CuentaPuntos(idCuenta,saldoActual);

                cuenta.setIdCuenta(idCuenta);

                cuenta.setSaldoActual(saldoActual);

                cuentas.add(cuenta);

            }

        } catch(IOException e) {

            e.printStackTrace();

        }

        return cuentas;

    }

    public void escribirCuenta(CuentaPuntos cuenta) {

        try(BufferedWriter bw =
                    Files.newBufferedWriter(
                            Paths.get(RUTA),
                            StandardOpenOption.APPEND)) {

            String linea =
                    cuenta.getIdCuenta() + "," +
                            cuenta.getSaldoActual();

            bw.newLine();

            bw.write(linea);

        } catch(IOException e) {

            e.printStackTrace();

        }

    }

}