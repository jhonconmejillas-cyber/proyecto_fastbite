package com.javeriana.proyecto_fastbite.dao;


import com.javeriana.proyecto_fastbite.model.Pedido;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
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

                 UUID idPedido = UUID.fromString(datos[0]);
                 LocalDateTime fechaHora = LocalDateTime.parse(datos[1]);;
                 String estado = datos[3];
                 double subtotal = Double.parseDouble(datos[4]);;
                 double iva = Double.parseDouble(datos[5]);;
                 double total = Double.parseDouble(datos[6]);;
                 UUID cliente = UUID.fromString(datos[7]);
                 UUID factura = UUID.fromString(datos[8]);;

                Pedido pedido =
                        new Pedido(estado,fechaHora,idPedido,iva,subtotal,total);

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
                            pedido.getIdCliente() + "," +
                            pedido.getIdfactura();

            bw.newLine();

            bw.write(linea);

        } catch(IOException e) {

            e.printStackTrace();

        }

    }

}