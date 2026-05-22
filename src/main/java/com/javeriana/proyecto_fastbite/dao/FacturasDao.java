package com.javeriana.proyecto_fastbite.dao;



import model.Factura;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FacturasDao {

    private final String RUTA =
            "src/main/resources/data/facturas.csv";

    public List<Factura> leerFacturas() {

        List<Factura> facturas =
                new ArrayList<>();

        return facturas;

    }

    public void escribirFactura(Factura factura) {

        try(BufferedWriter bw =
                    Files.newBufferedWriter(
                            Paths.get(RUTA),
                            StandardOpenOption.APPEND)) {

            String linea =
                    factura.getIdFactura() + "," +
                            factura.getFechaEmision() + "," +
                            factura.getSubtotal() + "," +
                            factura.getIva() + "," +
                            factura.getTotal() + "," +
                            factura.getMetodoPago();

            bw.newLine();

            bw.write(linea);

        } catch(IOException e) {

            e.printStackTrace();

        }

    }

}
