package com.javeriana.proyecto_fastbite.dao;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ClientesDao {

    private final String RUTA =
            "src/main/resources/data/clientes.csv";

    public List<Cliente> leerClientes() {

        List<Cliente> clientes =
                new ArrayList<>();

        try(BufferedReader br =
                    Files.newBufferedReader(Paths.get(RUTA))) {

            String linea;

            br.readLine();

            while((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                UUID id =
                        UUID.fromString(datos[0]);

                String nombre = datos[1];

                String email = datos[2];

                String telefono = datos[3];

                int puntos =
                        Integer.parseInt(datos[4]);

                Cliente cliente =
                        new Cliente();

                clientes.add(cliente);

            }

        } catch(IOException e) {

            e.printStackTrace();

        }

        return clientes;

    }

    public void escribirCliente(Cliente cliente) {

        try(BufferedWriter bw =
                    Files.newBufferedWriter(
                            Paths.get(RUTA),
                            StandardOpenOption.APPEND)) {

            String linea =
                    cliente.getIdCliente() + "," +
                            cliente.getNombre() + "," +
                            cliente.getEmail() + "," +
                            cliente.getTelefono() + "," +
                            cliente.getSaldoPuntos();

            bw.newLine();

            bw.write(linea);

        } catch(IOException e) {

            e.printStackTrace();

        }

    }

}
