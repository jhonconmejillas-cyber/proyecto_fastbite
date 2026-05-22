package com.javeriana.proyecto_fastbite.dao;


import model.Producto;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ProductosDao {

    private final String RUTA =
            "src/main/resources/data/productos.csv";

    public List<Producto> leerProductos() {

        List<Producto> productos =
                new ArrayList<>();

        try(BufferedReader br =
                    Files.newBufferedReader(Paths.get(RUTA))) {

            String linea;

            br.readLine();

            while((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                Producto producto =
                        new Producto();

                productos.add(producto);

            }

        } catch(IOException e) {

            e.printStackTrace();

        }

        return productos;

    }

    public void escribirProducto(Producto producto) {

        try(BufferedWriter bw =
                    Files.newBufferedWriter(
                            Paths.get(RUTA),
                            StandardOpenOption.APPEND)) {

            String linea =
                    producto.getIdProducto() + "," +
                            producto.getNombre() + "," +
                            producto.getPrecio() + "," +
                            producto.getDescripcion() + "," +
                            producto.isDisponible();

            bw.newLine();

            bw.write(linea);

        } catch(IOException e) {

            e.printStackTrace();

        }

    }

}
