import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Class c = getClass();
        Parent root = FXMLLoader.load(c.getResource("/GUI.fxml"));

        primaryStage.setTitle("Animal Shelter");
        primaryStage.setScene(new Scene(root, 600,273));
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        Reservation reservation = new Reservation();

        //Starts Run() form the reservation class
        Thread thread = new Thread(reservation);
        thread.start();

        launch(args);
    }
}