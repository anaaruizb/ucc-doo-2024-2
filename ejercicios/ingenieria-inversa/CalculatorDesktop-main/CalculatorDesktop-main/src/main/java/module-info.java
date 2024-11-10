module com.aslbank.calculadora {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.aslbank.calculadora to javafx.fxml;
    exports com.aslbank.calculadora;
    exports com.aslbank.calculadora.view.fxmlController;
    opens com.aslbank.calculadora.view.fxmlController to javafx.fxml;
    exports com.aslbank.calculadora.model;
    exports com.aslbank.calculadora.controller;
}