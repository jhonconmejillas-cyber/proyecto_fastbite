module com.javeriana.proyecto_fastbite {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.javeriana.proyecto_fastbite;


    opens com.javeriana.proyecto_fastbite to javafx.fxml;
    exports com.javeriana.proyecto_fastbite;
}