package com.example.grid_pane;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloController {
    List<User> uzivatele = new ArrayList<>();
    @FXML
    private TextField Jmeno;
    @FXML
    private TextField Prijmeni;
    @FXML
    private TextField Login;
    @FXML
    private TextField Heslo;
    @FXML
    private ColorPicker OblibenaBarva;
    @FXML
    private DatePicker DatumNarozeni;
    @FXML
    private TextArea Vypis;
    @FXML
    private CheckBox Anglictina;
    @FXML
    private CheckBox Cestina;
    @FXML
    private CheckBox Nemcina;
    @FXML
    private CheckBox Spanelstina;
    @FXML
    private RadioButton Ano;
    @FXML
    private RadioButton Ne;

    @FXML
    protected void onRegistreButtonClick() {
        if (Ano.isSelected()) {
            int pocetJazyku = 0;
            if  (Anglictina.isSelected()) {
                pocetJazyku++;

            }
            if  (Cestina.isSelected()) {
                pocetJazyku++;
            }
            if  (Nemcina.isSelected()) {
                pocetJazyku++;
            }
            if  (Spanelstina.isSelected()) {
                pocetJazyku++;
            }
            Vypis.setText(" Jmeno: "+Jmeno.getText() + " Prijmeni: "+Prijmeni.getText() +" Datum narozeni: "+ DatumNarozeni.getValue()+" Login: "+Jmeno.getText() + " Pocet ovladanych jazyku: "+pocetJazyku);
            String jmeno = Jmeno.getText();
            String prijmeni = Prijmeni.getText();
            String login = Login.getText();
            String heslo = Heslo.getText();
            String datumNarozeni = DatumNarozeni.getValue().toString();
            String oblibenaBarva = OblibenaBarva.getValue().toString();
            User u = new User(jmeno,prijmeni,login,heslo,datumNarozeni,oblibenaBarva);
            uzivatele.add(u);
        }else if(Ne.isSelected()) {
            Vypis.setStyle("-fx-text-fill: #ff0000");
            Vypis.setText("Uzivatele nelze registrovat.");
        }
    }
    @FXML
    protected void onVypisButtonClick() {
        String vypis = "";
        for (int i = 0; i<uzivatele.size();i++) {
            vypis = vypis+uzivatele.get(i).toString()+"\n";
        }
        Vypis.setText(vypis);
    }
}