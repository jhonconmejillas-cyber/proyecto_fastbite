package com.javeriana.proyecto_fastbite.dao;




import com.javeriana.proyecto_fastbite.model.Factura;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FacturasDao {

    private final String RUTA =
            "src/main/resources/data/facturas.csv";

    public List<Factura> leerFacturas() {

        List<Factura> facturas =
                new ArrayList<>();

        try(BufferedReader br =
                    Files.newBufferedReader(Paths.get(RUTA))) {

            String linea;

            br.readLine();

            while((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                UUID idFactura =
                        UUID.fromString(datos[0]);

                LocalDateTime fechaEmision =
                        LocalDateTime.parse(datos[1]);

                double subtotal =
                        Double.parseDouble(datos[2]);

                double iva =
                        Double.parseDouble(datos[3]);

                double total =
                        Double.parseDouble(datos[4]);

                String metodoPago =
                        datos[5];

                Factura factura =
                        new Factura(
                                fechaEmision,
                                idFactura,
                                iva,
                                metodoPago,
                                subtotal,
                                total
                        );

                facturas.add(factura);

            }

        } catch(IOException e) {

            e.printStackTrace();

        }

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