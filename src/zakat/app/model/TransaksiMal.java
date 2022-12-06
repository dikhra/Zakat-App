/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zakat.app.model;

import java.sql.Date;

/**
 *
 * @author dimas
 */
public class TransaksiMal {

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public TransaksiMal(int idTransaksi, int idMuzakki, String nama, int penghasilan, Date tanggal, int totalBayar) {
        this.idTransaksi = idTransaksi;
        this.idMuzakki = idMuzakki;
        this.nama = nama;
        this.penghasilan = penghasilan;
        this.tanggal = tanggal;
        this.totalBayar = totalBayar;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdMuzakki() {
        return idMuzakki;
    }

    public void setIdMuzakki(int idMuzakki) {
        this.idMuzakki = idMuzakki;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(int penghasilan) {
        this.penghasilan = penghasilan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }

    private int idTransaksi;
    private int idMuzakki;
    private String nama;
    private int penghasilan;
    private Date tanggal;
    private int totalBayar;
}