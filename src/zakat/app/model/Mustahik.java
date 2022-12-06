/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zakat.app.model;

/**
 *
 * @author dimas
 */
public class Mustahik {

    int id;
    String nama;
    String alamat;
    int rt;
    int rw;
    String noTelp;
    int penghasilan;

    public Mustahik(int id, String nama, String alamat, int rt, int rw, String noTelp, int penghasilan) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.rt = rt;
        this.rw = rw;
        this.noTelp = noTelp;
        this.penghasilan = penghasilan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getRt() {
        return rt;
    }

    public void setRt(int rt) {
        this.rt = rt;
    }

    public int getRw() {
        return rw;
    }

    public void setRw(int rw) {
        this.rw = rw;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public int getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(int penghasilan) {
        this.penghasilan = penghasilan;
    }

}
