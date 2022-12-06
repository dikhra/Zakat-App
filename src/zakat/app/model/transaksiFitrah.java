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
public class TransaksiFitrah {

    private int idTransaksi;
    private int idMuzakki;
    private String jenisPembayaran;
    private String nama;
    private Date tanggal;
    private int totalBayar;
    private int totalBeras;

    public TransaksiFitrah(int idTransaksi, int idMuzakki, String jenisPembayaran, String nama, Date tanggal, int totalbayar, int totalberas) {
        this.idTransaksi = idTransaksi;
        this.idMuzakki = idMuzakki;
        this.jenisPembayaran = jenisPembayaran;
        this.nama = nama;
        this.tanggal = tanggal;
        this.totalBayar = totalbayar;
        this.totalBeras = totalberas;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public int getIdMuzakki() {
        return idMuzakki;
    }

    public String getJenisPembayaran() {
        return jenisPembayaran;
    }

    public String getNama() {
        return nama;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public int getTotalBayar() {
        return totalBayar;
    }

    public int getTotalBeras() {
        return totalBeras;
    }

}
