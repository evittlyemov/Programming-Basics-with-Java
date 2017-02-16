package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField num1;
    public TextField num2;
    public TextField resultField;

    public void calculate(ActionEvent actionEvent) {
        try {
            double number1 = Double.parseDouble(num1.getText());
            double number2 = Double.parseDouble(num2.getText());

            double result = number1 + number2;

            resultField.setText(String.valueOf(result));
        }
        catch(Exception e) {
            resultField.setText("Error!");
        }
    }
}
