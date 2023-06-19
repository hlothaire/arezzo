package arezzo;

import arezzo.model.Arezzo;
import arezzo.view.VueClavier;
import arezzo.view.VueMenu;
import arezzo.view.VuePartition;
import arezzo.view.VuepanneauControle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Scanner;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Arezzo arez = new Arezzo();
        BorderPane root = new BorderPane();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("view/VuePartition.fxml"));
        loader.setControllerFactory(iC->new VuePartition(arez));
        root.setCenter(loader.load());

        FXMLLoader loader1 = new FXMLLoader();
        loader1.setLocation(getClass().getResource("view/Clavier.fxml"));
        loader1.setControllerFactory(iC->new VueClavier(arez));
        root.setBottom(loader1.load());

        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("view/panneauControle.fxml"));
        loader2.setControllerFactory(iC->new VuepanneauControle(arez));
        root.setRight(loader2.load());

        FXMLLoader loader3 = new FXMLLoader();
        loader3.setLocation(getClass().getResource("view/Menu.fxml"));
        loader3.setControllerFactory(iC->new VueMenu(arez));
        root.setTop(loader3.load());

        primaryStage.setScene(new Scene(root, 1000,700));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

