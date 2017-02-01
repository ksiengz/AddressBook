package application;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Created by Konrad on 01.02.2017.
 */
public class MainWindowController {

    @FXML
    TableView<Person> tableView;
    @FXML
    TableColumn<Person, String> firstNameColumn;
    @FXML
    TableColumn<Person, String> lastNameColumn;

    private Main main;

    public void initialize() {
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
    }

    public void setMain(Main main) {
        this.main = main;
        tableView.setItems(main.getPersonData());
    }

    @FXML
    public void handleNew() {

    }

    @FXML
    public void handleEdit() {

    }

    @FXML
    public void handleDelete() {

    }
}
