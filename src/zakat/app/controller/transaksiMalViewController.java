/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package zakat.app.controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import zakat.app.util.DatabaseConnection;

/**
 * FXML Controller class
 *
 * @author dimas
 */
public class transaksiMalViewController implements Initializable {
    
    @FXML
    private TextField namaTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField penghasilanTextField;
    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private Label messageLabel;
    @FXML
    private TextField totalBayarTextField;
    
    DatabaseConnection connectNow = new DatabaseConnection();
    Connection connectDB = connectNow.getConnection();
    
    @FXML
    public void bayarButtonOnClick() {
        Date sqlDate = Date.valueOf(dateDatePicker.getValue());
        String query = "INSERT INTO transaksimaal VALUES (NULL, '" + idTextField.getText() + "','" + namaTextField.getText() + "','" + penghasilanTextField.getText() + "','" + sqlDate + "','" + totalBayarTextField.getText() + "')";
        
        try {
            Statement st = connectDB.createStatement();
            st.executeUpdate(query);
            
            messageLabel.setText("Pembayaran berhasil.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    @FXML
    public void checkButtonOnClick() {
        String nama = namaTextField.getText();
        String query = "SELECT id_muzakki, penghasilan FROM muzakki WHERE namamuzakki = '" + nama + "'";
        
        try {
            Statement st = connectDB.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String id = rs.getString("id_muzakki");
                String penghasilan = rs.getString("penghasilan");
                int totalBayar = (int) (Integer.parseInt(rs.getString("penghasilan")) * 0.025);
                
                idTextField.setText(id);
                penghasilanTextField.setText(penghasilan);
                totalBayarTextField.setText(Integer.toString(totalBayar));
            }
        } catch (SQLException e) {
            messageLabel.setText("Data tidak ada.");
            System.out.print(e);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
