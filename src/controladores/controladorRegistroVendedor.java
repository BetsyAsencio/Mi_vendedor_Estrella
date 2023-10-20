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
import javafx.stage.Stage;

public class controladorRegistroVendedor {

    @FXML
    private PasswordField textField_contrasenia;

    @FXML
    private TextField textField_usuario;

    @FXML
    private Button BTRegistrar;

    @FXML
    void RegistrarVendedor(ActionEvent event) {
        
        Stage myStage = (Stage) this.BTRegistrar.getScene().getWindow();
        myStage.close();
    }

}
