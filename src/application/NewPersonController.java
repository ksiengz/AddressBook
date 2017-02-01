package application;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

/**
 * Created by Konrad on 01.02.2017.
 */
public class NewPersonController {

    @FXML private TextField firstNameField, lastNameField, phoneField, cityField, postcodeField;

    private Main main;
    private Stage stage;
    private Person person;
    private boolean okClicked;

    public void setMain(Main main, Stage stage, Person person) {
        this.main = main;
        this.stage = stage;
        this.person = person;
        if(person != null) {
            fillPersonDetails();
        }
    }
    
    public boolean isOkClicked() {
        return okClicked;
    }

    public void fillPersonDetails() {
        firstNameField.setText(person.getFirstName());
        lastNameField.setText(person.getLastName());
        phoneField.setText(person.getPhone());
        cityField.setText(person.getCity());
        postcodeField.setText(person.getPostCode());
    }

    @FXML
    public void handleOK() {
        if(person != null) {
            person.setFirstName(firstNameField.getText());
            person.setLastName(lastNameField.getText());
            person.setPhone(phoneField.getText());
            person.setCity(cityField.getText());
            person.setPostCode(postcodeField.getText());
            okClicked = true;
        } else {
            Person newPerson = new Person(
                    firstNameField.getText(),
                    lastNameField.getText(),
                    phoneField.getText(),
                    cityField.getText(),
                    postcodeField.getText()
            );
            main.getPersonData().add(newPerson);
        }
        stage.close();
    }

    @FXML
    public void handleCancel() {
        stage.close();
    }

}
