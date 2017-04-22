package ru.esstu;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.apache.commons.lang.StringUtils;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable
{


    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private Label messageLabel;

    @FXML private ComboBox<City> cities;

    public void sayHello() {

        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();


        StringBuilder builder = new StringBuilder();

        if (!StringUtils.isEmpty(firstName)) {
            builder.append(firstName);
        }

        if (!StringUtils.isEmpty(lastName)) {
            if (builder.length() > 0) {
                builder.append(" ");
            }
            builder.append(lastName);
        }

        if (builder.length() > 0) {
            String name = builder.toString();

            messageLabel.setText("Hello " + name);
        } else {
            messageLabel.setText("Id -  " + cities.getSelectionModel().getSelectedItem().getId());
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cities.getItems().add(new City(1, "Ulan-Ude"));

    }
}
