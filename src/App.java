/*
Andrew Kulowski 
Lab #2 & 3 
2/15/23
This programs runs and displays 
a textbox in which you can type any string and have it be displayed byt the computer
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class App extends Application {
    @Override

    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Sample.fxml"));
            Scene scene = new Scene(root, 400, 400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.class.path"));
        launch(args);
    }
}