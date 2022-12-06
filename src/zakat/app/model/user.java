/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zakat.app.model;

/**
 *
 * @author dimas
 */

class User {
    int id;
    String nama;
    String alamat;
    String username;
    String password;
    String status;
    
    public  User(int id, String nama, String alamat, String username, String password, String status){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.username = username;
        this.password = password;
        this.status = status;
    }
}
