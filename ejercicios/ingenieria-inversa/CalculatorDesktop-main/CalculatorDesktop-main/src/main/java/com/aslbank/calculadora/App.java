package com.aslbank.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        String FXMLMini="miniCalculator.fxml";
        String FXMLDocument="FXMLDocument.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(FXMLMini));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}