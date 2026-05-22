package com.javeriana.proyecto_fastbite.dao;



import com.javeriana.proyecto_fastbite.model.DetallePedido;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DetallePedidoDao {

    private final String RUTA =
            "src/main/resources/data/detalle_pedido.csv";

    public List<DetallePedido> leerDetalles() {

        List<DetallePedido> detalles =
                new ArrayList<>();

        try(BufferedReader br =
                    Files.newBufferedReader(Paths.get(RUTA))) {

            String linea;

            br.readLine();

            while((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                UUID idDetalle =
                        UUID.fromString(datos[0]);

                UUID idPedido =
                        UUID.fromString(datos[1]);

                UUID idProducto =
                        UUID.fromString(datos[2]);

                int cantidad =
                        Integer.parseInt(datos[3]);

                double subtotal =
                        Double.parseDouble(datos[4]);

                DetallePedido detalle =
                        new DetallePedido(
                                idDetalle,
                                idPedido,
                                idProducto,
                                cantidad,
                                subtotal
                        );

                detalles.add(detalle);

            }

        } catch(IOException e) {

            e.printStackTrace();

        }

        return detalles;

    }

    public void escribirDetalle(DetallePedido detalle) {

        try(BufferedWriter bw =
                    Files.newBufferedWriter(
                            Paths.get(RUTA),
                            StandardOpenOption.APPEND)) {

            String linea =
                    detalle.getIdDetalle() + "," +
                            detalle.getIdPedido() + "," +
                            detalle.getIdProducto() + "," +
                            detalle.getCantidad() + "," +
                            detalle.getSubtotal();

            bw.newLine();

            bw.write(linea);

        } catch(IOException e) {

            e.printStackTrace();

        }

    }

    public List<DetallePedido>
    buscarPorPedido(UUID idPedidoBuscado) {

        List<DetallePedido> resultados =
                new ArrayList<>();

        List<DetallePedido> detalles =
                leerDetalles();

        for(DetallePedido detalle : detalles) {

            if(detalle.getIdPedido()
                    .equals(idPedidoBuscado)) {

                resultados.add(detalle);

            }

        }

        return resultados;

    }

}
