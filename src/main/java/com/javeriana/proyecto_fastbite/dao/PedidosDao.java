package com.javeriana.proyecto_fastbite.dao;


import model.Pedido;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class PedidosDao {

    private final String RUTA =
            "src/main/resources/data/pedidos.csv";

    public List<Pedido> leerPedidos() {

        List<Pedido> pedidos =
                new ArrayList<>();

        try(BufferedReader br =
                    Files.newBufferedReader(Paths.get(RUTA))) {

            String linea;

            br.readLine();

            while((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                Pedido pedido =
                        new Pedido();

                pedidos.add(pedido);

            }

        } catch(IOException e) {

            e.printStackTrace();

        }

        return pedidos;

    }

    public void escribirPedido(Pedido pedido) {

        try(BufferedWriter bw =
                    Files.newBufferedWriter(
                            Paths.get(RUTA),
                            StandardOpenOption.APPEND)) {

            String linea =
                    pedido.getIdPedido() + "," +
                            pedido.getFechaHora() + "," +
                            pedido.getEstado() + "," +
                            pedido.getSubtotal() + "," +
                            pedido.getIva() + "," +
                            pedido.getTotal() + "," +
                            pedido.getCliente().getIdCliente() + "," +
                            pedido.getFactura().getIdFactura();

            bw.newLine();

            bw.write(linea);

        } catch(IOException e) {

            e.printStackTrace();

        }

    }

}