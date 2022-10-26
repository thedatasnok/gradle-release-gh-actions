package cool.datasnok.samples.clienta;

import cool.datasnok.samples.core.StringUtils;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ClientAApplication extends Application {

  @Override
  public void start(Stage stage) {
    Label label = new Label(StringUtils.replaceVocals("Hello, Client A", 'U'));
    Scene scene = new Scene(new StackPane(label), 640, 480);
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }

}
