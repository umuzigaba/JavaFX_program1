package demo1.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text text;

    @FXML
    private TextField textField;

    @FXML
    void setText(ActionEvent event) {
        text.setText(textField.getText());
    }

}
