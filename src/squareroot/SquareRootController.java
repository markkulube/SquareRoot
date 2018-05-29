package squareroot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Mark Kulube (markkulube@gmail.com)
 */

public class SquareRootController implements Initializable{

    @FXML
    private Button calculate, reset;

    @FXML
    private TextField inputText;

    @FXML
    private Label result;

    private SquareRoot squareRootObj;

    public SquareRootController() {
        squareRootObj = new SquareRoot();
    }

    /**
     *
     * This method is called when the calculate button is clicked.
     *
     * @param event
     */
    public void onCalculate(ActionEvent event) {
        try {
            if(!inputText.getText().isEmpty()) {
                inputText.setDisable(true);
                String squareRootText =
                    squareRootObj.calculateSquareRoot(inputText.getText());
                result.setText(squareRootText);
            }
        } catch (Exception e) {
            result.setText("Invalid input, try again");
            inputText.clear();
            inputText.setDisable(false);
        }
    }

    /**
     *
     * This method is called when the reset button is clicked and
     * clears the input and result fields.
     *
     * @param event
     */
    public void onReset(ActionEvent event) {
        inputText.clear();
        result.setText("");
        inputText.setDisable(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
