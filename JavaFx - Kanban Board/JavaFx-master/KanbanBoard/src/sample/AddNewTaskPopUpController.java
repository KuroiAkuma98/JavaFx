package sample;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class AddNewTaskPopUpController
{
    private DatePicker datePicker;
    private TextField titleTextField;
    private TextArea descriptionBox;

    public void pressAddButton(ActionEvent event)
    {
        Task task = new Task(titleTextField.getText(),datePicker.getValue(),Main.getComboBox().getValue(),descriptionBox.getText());

        //Controller.getToDoObservableList().add(new Task);
        //Controller.getToDoListView().setItems().getToDoObservableList();
        //Controller.getSecondaryStage().close;

    }
}
