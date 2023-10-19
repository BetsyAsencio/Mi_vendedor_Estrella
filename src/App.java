import java.io.IOException;

import controladores.controladorLogin;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {

        try {
            String cssFile = getClass().getResource("estilos css/estilos.css").toExternalForm();
            System.out.println(cssFile);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/login.fxml"));
            Parent root = loader.load();

            controladorLogin control = loader.getController();
            control.inicializar(cssFile);

            Scene scene = new Scene(root);
            scene.getStylesheets().add(cssFile);

            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
