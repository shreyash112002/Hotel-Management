module com.example.minipro{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.minipro to javafx.fxml;
    exports com.example.minipro;
}