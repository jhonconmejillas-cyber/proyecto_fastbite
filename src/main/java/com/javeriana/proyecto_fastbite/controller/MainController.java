package com.javeriana.proyecto_fastbite.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {

    @FXML
    private StackPane contenedorPrincipal;

    private void cargarVista(String ruta) {

        try {

            Parent vista = FXMLLoader.load(
                    getClass().getResource(ruta)
            );

            contenedorPrincipal.getChildren().setAll(vista);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void abrirLogin() {
        cargarVista("/view/LoginView.fxml");
    }

    @FXML
    public void abrirCajero() {
        cargarVista("/view/CajeroView.fxml");
    }

    @FXML
    public void abrirCocina() {
        cargarVista("/view/CocinaView.fxml");
    }

    @FXML
    public void abrirInventario() {
        cargarVista("/view/InventarioView.fxml");
    }

    @FXML
    public void abrirProductos() {
        cargarVista("/view/AdminProductosView.fxml");
    }

    @FXML
    public void abrirReportes() {
        cargarVista("/view/ReportesView.fxml");
    }
}
