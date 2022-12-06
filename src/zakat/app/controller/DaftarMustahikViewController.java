/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package zakat.app.controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import zakat.app.util.DatabaseConnection;

/**
 * FXML Controller class
 *
 * @author dimas
 */
public class DaftarMustahikViewController implements Initializable {

    @FXML
    private TextField namaTextField;
    @FXML
    private TextArea alamatTextField;
    @FXML
    private TextField rtTextField;
    @FXML
    private TextField rwTextField;
    @FXML
    private TextField nomorTeleponTextField;
    @FXML
    private TextField penghasilanTextField;
    @FXML
    private Label confirmLabel;

    private String nama;
    private String alamat;
    private String rt;
    private String rw;
    private String noTelp;
    private String penghasilan;

    @FXML
    private void submitButtonOnClick() {
        nama = namaTextField.getText();
        alamat = alamatTextField.getText();
        rt = rtTextField.getText();
        rw = rwTextField.getText();
        noTelp = nomorTeleponTextField.getText();
        penghasilan = penghasilanTextField.getText();

        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();

        String query = "INSERT INTO mustahik VALUES (NULL, '" + nama + "','" + alamat + "','" + rt + "','" + rw + "','" + noTelp + "','" + penghasilan + "')";

        if ((namaTextField.getText() != null && !namaTextField.getText().isEmpty())
                && (alamatTextField.getText() != null && !alamatTextField.getText().isEmpty())
                && (rtTextField.getText() != null && !rtTextField.getText().isEmpty())
                && (rwTextField.getText() != null && !rwTextField.getText().isEmpty())
                && (nomorTeleponTextField.getText() != null && !nomorTeleponTextField.getText().isEmpty())
                && (penghasilanTextField.getText() != null && !penghasilanTextField.getText().isEmpty())) {
            try {

                Statement statement = connectDB.createStatement();
                statement.executeUpdate(query);

                namaTextField.clear();
                alamatTextField.clear();
                rtTextField.clear();
                rwTextField.clear();
                nomorTeleponTextField.clear();
                penghasilanTextField.clear();

                confirmLabel.setText("Daftar berhasil.");
            } catch (SQLException e) {
                e.printStackTrace();
                confirmLabel.setText("Gagal!");
                System.out.println(e);
            }
        } else {
            confirmLabel.setText("Isi semua data yang diperlukan!");
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
