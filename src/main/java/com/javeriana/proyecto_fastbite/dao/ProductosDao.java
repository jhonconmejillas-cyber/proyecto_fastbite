package com.javeriana.proyecto_fastbite.dao;


import com.javeriana.proyecto_fastbite.model.Producto;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
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
                UUID idproducto = UUID.fromString(datos[0]);

                String nombre = datos[1];

                double precio = Double.parseDouble(datos[2]);

                String descripcion = datos[4];
                Boolean disponible = Boolean.parseBoolean(datos[5]);

                Producto producto =
                        new Producto(idproducto,descripcion,disponible,nombre,precio);

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
