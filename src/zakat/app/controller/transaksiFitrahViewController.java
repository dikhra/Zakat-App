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
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import zakat.app.model.transaksiFitrah;
import zakat.app.util.DatabaseConnection;

/**
 * FXML Controller class
 *
 * @author dimas
 */
public class transaksiFitrahViewController implements Initializable {

    @FXML
    private TextField namaTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField penghasilanTextField;
    @FXML
    private RadioButton berasRadioButton;
    @FXML
    private ToggleGroup jenisPembayaran;
    @FXML
    private RadioButton uangRadioButton;
    @FXML
    private Button checkButton;
    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private Button bayarButton;
    @FXML
    private TableView<transaksiFitrah> TableView;
    @FXML
    private TableColumn<transaksiFitrah, Integer> idTransaksiColumn;
    @FXML
    private TableColumn<transaksiFitrah, Integer> idMuzakkiColumn;
    @FXML
    private TableColumn<transaksiFitrah, String> namaColumn;
    @FXML
    private TableColumn<transaksiFitrah, Date> TanggalColumn;
    private TableColumn<transaksiFitrah, String> jenisPembayaranColumn;
    @FXML
    private TableColumn<transaksiFitrah, Integer> uangColumn;
    @FXML
    private TableColumn<transaksiFitrah, Integer> berasColumn;

    public ObservableList<transaksiFitrah> getTransaksiFitrahList() {
        ObservableList<transaksiFitrah> transaksiFitrahList = FXCollections.observableArrayList();
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();
        String query = "SELECT * FROM transaksifitrah ";
        Statement st;
        ResultSet rs;

        try {
            st = connectDB.createStatement();
            rs = st.executeQuery(query);
            transaksiFitrah transaksiFitrah;
            while (rs.next()) {
                    transaksiFitrah = new transaksiFitrah(rs.getInt("id_transaksi"), rs.getInt("id_muzakki"), rs.getString("namamuzakki"), rs.getString("jenisPembayaran"), rs.getDate("tanggal"), rs.getInt("totalbayar"), rs.getInt("totalberas"));
                transaksiFitrahList.add(transaksiFitrah);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return transaksiFitrahList;
    }

    // I had to change ArrayList to ObservableList I didn't find another option to do this but this works :)
    public void showTransaksiFitrah() {
        ObservableList<transaksiFitrah> list = getTransaksiFitrahList();

        idTransaksiColumn.setCellValueFactory(new PropertyValueFactory<>("idTransaksi"));
        idMuzakkiColumn.setCellValueFactory(new PropertyValueFactory<>("idMuzakki"));
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));
        TanggalColumn.setCellValueFactory(new PropertyValueFactory<>("tanggal"));
        jenisPembayaranColumn.setCellValueFactory(new PropertyValueFactory<>("jenisPembayaran"));
        uangColumn.setCellValueFactory(new PropertyValueFactory<>("uang"));
        berasColumn.setCellValueFactory(new PropertyValueFactory<>("beras"));

        TableView.setItems(list);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        showTransaksiFitrah();
    }

}
