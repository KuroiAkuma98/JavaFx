package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage primaryStage = new Stage();
    public static Stage getPrimaryStage()
    {
        return primaryStage;
    }

    public static ComboBox<Priority>comboBox;
    public static ObservableList<Priority> priorityList = FXCollections.observableArrayList();
    public static ObservableList<Priority> getPriorityList()
    {
        return priorityList;
    }

    public static void setComboBox(ComboBox<Priority> comboBox)
    {
        Main.comboBox = comboBox;
    }
    public  static ComboBox<Priority> getComboBox()
    {
        return comboBox;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Kanban Table");
        primaryStage.setScene(new Scene(root, 920, 600));
        primaryStage.show();
        primaryStage.setResizable(false);

        priorityList.add(Priority.Extreme);
        priorityList.add(Priority.Low);
        priorityList.add(Priority.High);
        priorityList.add(Priority.Moderate);

    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
