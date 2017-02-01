package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage){
        this.primaryStage = primaryStage;
        mainWindow();
    }

    private void mainWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainWindowView.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);

            MainWindowController controller = loader.getController();
            controller.setMain(this);

            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ObservableList<Person> personData = FXCollections.observableArrayList();
    public ObservableList<Person> getPersonData() { return personData; }

    public Main() {
        personData.add(new Person("Dr","Frankenstein","123456","London","6666666"));
        personData.add(new Person("Steve","Jobs","12321312","Silicon Valley","12345"));
        personData.add(new Person("Abraham","Lincoln","2349034","Washington","1776"));
        personData.add(new Person("Paul","Auster","2345612","New York","1492"));
        personData.add(new Person("Homer","Simpson","2302320","Springfield","4423123"));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
