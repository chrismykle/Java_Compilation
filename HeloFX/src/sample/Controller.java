package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private Label lblNavn;

    @FXML
    private TextField txtFornavn;

    @FXML
    private TextField txtEtternavn;

    @FXML
    private CheckBox chxJa;

    @FXML
    private CheckBox chxNei;


    @FXML
    void trykkMeg(ActionEvent event) {
        String ut;
        String fornavn = txtFornavn.getText();
        String etternavn = txtEtternavn.getText();
        String navn = fornavn+" "+etternavn;
        ut = navn+" ";
        if (chxJa.isSelected()){
            ut +="liker Java";
        }
        if (chxNei.isSelected()){
            ut +="liker ikke Java";
        }
        if (chxJa.isSelected() && chxNei.isSelected()){
            ut = navn+", velg ett alternativ.";
        }
        lblNavn.setText(ut);


    }

}
