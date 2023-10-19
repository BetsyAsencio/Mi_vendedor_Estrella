package controladores;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class controladorRegistro {
    @FXML
    private Button BTMenu;

    private String estilos;

    @FXML
    void IrMenu(ActionEvent event) {
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/Menu_Admin.fxml"));
            Parent root = loader.load();

            controladorMenuADMIN control = loader.getController();
            control.inicializar(estilos);

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            scene.getStylesheets().add(estilos);
            stage.show();

            Stage myStage = (Stage) this.BTMenu.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
        }
    }

    public void inicializar(String estilos) {
        this.estilos = estilos;
    }
}
