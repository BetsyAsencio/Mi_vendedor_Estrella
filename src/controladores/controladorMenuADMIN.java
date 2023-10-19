package controladores;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class controladorMenuADMIN {
    
    @FXML
    private Button BTinventarioADM;

    @FXML
    private Button BTiregistroADM;

    @FXML
    private Button BTicomprarADM;

    private String estilos;

    public void inicializar(String estilos){
        this.estilos = estilos;
    }
    @FXML
    void mostarInventario(ActionEvent event) {
        try {
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/Inventario.fxml"));
            Parent root = loader.load();

            controladorInventario control = loader.getController();
            control.inicializar(estilos);

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            scene.getStylesheets().add(estilos);
            stage.show();

            Stage myStage = (Stage) this.BTinventarioADM.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
        }
    }

    @FXML
    void mostrarRegistro(ActionEvent event) {
    try {
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/registroVendedores.fxml"));
            Parent root = loader.load();

            controladorRegistro control = loader.getController();
            control.inicializar(estilos);

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            scene.getStylesheets().add(estilos);
            stage.show();

            Stage myStage = (Stage) this.BTinventarioADM.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
        }
    }
    
}
