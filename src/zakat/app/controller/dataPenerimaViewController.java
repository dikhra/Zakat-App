/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package zakat.app.controller;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import zakat.app.model.Mustahik;
import zakat.app.model.User;
import zakat.app.util.DatabaseConnection;

/**
 * FXML Controller class
 *
 * @author dimas
 */
public class dataPenerimaViewController implements Initializable {

    @FXML
    private TableView<Mustahik> table;
    @FXML
    private TableColumn<Mustahik, String> idCol;
    @FXML
    private TableColumn<Mustahik, String> namaCol;
    @FXML
    private TableColumn<Mustahik, String> alamatCol;
    @FXML
    private TableColumn<Mustahik, String> rtCol;
    @FXML
    private TableColumn<Mustahik, String> rwCol;
    @FXML
    private TableColumn<Mustahik, String> noTelpCol;
    @FXML
    private TableColumn<Mustahik, String> penghasilanCol;

    DatabaseConnection connectNow = new DatabaseConnection();
    Connection connectDB = connectNow.getConnection();
    String query = "SELECT * FROM `mustahik`";

    ObservableList<Mustahik> MustahikList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        load();
    }

    private void load() {
        Connection connectDB = connectNow.getConnection();
        refreshTable();

        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        namaCol.setCellValueFactory(new PropertyValueFactory<>("nama"));
        alamatCol.setCellValueFactory(new PropertyValueFactory<>("alamat"));
        rtCol.setCellValueFactory(new PropertyValueFactory<>("rt"));
        rwCol.setCellValueFactory(new PropertyValueFactory<>("rw"));
        noTelpCol.setCellValueFactory(new PropertyValueFactory<>("noTelp"));
        penghasilanCol.setCellValueFactory(new PropertyValueFactory<>("penghasilan"));
    }

    private void refreshTable() {
        try {
            MustahikList.clear();

            Statement statement = connectDB.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                MustahikList.add(new Mustahik(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getInt(7)));
                table.setItems(MustahikList);
            }
        } catch (SQLException e) {
            Logger.getLogger(dataPenerimaViewController.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
