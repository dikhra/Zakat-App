/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package zakat.app.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dimas
 */
public class MenuViewController implements Initializable {

    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;
    @FXML
    private Button logoutButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void home(MouseEvent event) {
        bp.setCenter(ap);
    }

    @FXML
    private void page1(MouseEvent event) {
        loadPage("tentangZakatView");
    }

    @FXML
    private void page2(MouseEvent event) {
        loadPage("jenisZakatView");
    }

    @FXML
    private void page3(MouseEvent event) {
        loadPage("niatZakatView");
    }

    @FXML
    private void page4(MouseEvent event) {
        loadPage("daftarMustahikView");
    }

    @FXML
    private void page5(MouseEvent event) {
        loadPage("daftarMuzakkiView");
    }
    
        @FXML
    private void page6(MouseEvent event) {
        loadPage("transaksiFitrahView");
    }

    @FXML
    private void page7(MouseEvent event) {
        loadPage("transaksiMalView");
    }
    
    @FXML
    private void keluarAkun(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/zakat/app/view/LoginView.fxml"));

        Stage window = (Stage) logoutButton.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }

    private void loadPage(String page) {
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource("/zakat/app/view/" + page + ".fxml"));
        } catch (IOException e) {
            Logger.getLogger(MenuViewController.class.getName()).log(Level.SEVERE, null, e);
        }

        bp.setCenter(root);
    }



}
