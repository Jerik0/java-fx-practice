package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFXApp extends Application {
  @Override
  public void start(Stage primaryStage) {
    Button btOk = new Button("OK");
    Scene scene = new Scene(btOk, 200, 250);
    primaryStage.setTitle("My JavaFX");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
