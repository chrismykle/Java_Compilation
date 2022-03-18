package sample;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.*;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Controller {

    List<Double> register = new ArrayList<>();

    @FXML
    private TextField txtTemperatur;

    @FXML
    private Label lblMin;

    @FXML
    private Label lblMaks;

    @FXML
    private Label lblGjennomsnitt;


    @FXML
    private Label lblFeil;

    lblFeil.setText("Skriv inn en gyldig verdi")

}

    @FXML
    void nullstill(ActionEvent event) {
    register.clear();
    }

    @FXML
    void registrer(ActionEvent event) {
        register.add(txtTemperatur);
        register.sort(Comparator.naturalOrder());
        lblMin.setText(register[0]);
        lblMax.setText(register[]);
    }

}