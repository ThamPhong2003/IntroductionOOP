module com.example.demo3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.java;
    requires java.sql;
    requires org.controlsfx.controls;


    opens com.example.demo3 to javafx.fxml;
    exports com.example.demo3;
    requires javafx.base;
    requires javafx.graphics;

    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    // add icon pack modules
}