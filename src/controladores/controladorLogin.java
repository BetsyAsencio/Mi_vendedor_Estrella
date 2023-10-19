package controladores;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class controladorLogin {

    @FXML
    private AnchorPane fondo;

    @FXML
    private PasswordField textField_contrasenia;

    @FXML
    private TextField textField_usuario;
    @FXML
    private Button BTinicio;

    private String estilos;

    @FXML
    void InicioSesion(ActionEvent event) {
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

            Stage myStage = (Stage) this.BTinicio.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
        }
    }

    @FXML
    void quitarFoco(MouseEvent event) {
        fondo.requestFocus();
    }

    public void inicializar(String estilos){
        this.estilos = estilos;
    }
}
