/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
/**
 *
 * @author ASUS
 */
public class Transaksi {
    private int id;
    private String namaPenggadai;
    private String kontak;
    private String namaBarang;
    private double nilaiTaksir;
    private double jumlahPinjaman;
    private LocalDate tanggalGadai;
    private LocalDate tanggalJatuhTempo;
    private String keteranganBarang;
    private String status; // Digadaikan / Ditebus
    private Double bunga;
    private Double denda;
    private Double totalTebusan;

    // Konstruktor
    public Transaksi() {}

    // Getter dan Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaPenggadai() {
        return namaPenggadai;
    }

    public void setNamaPenggadai(String namaPenggadai) {
        this.namaPenggadai = namaPenggadai;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public double getNilaiTaksir() {
        return nilaiTaksir;
    }

    public void setNilaiTaksir(double nilaiTaksir) {
        this.nilaiTaksir = nilaiTaksir;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void setJumlahPinjaman(double jumlahPinjaman) {
        this.jumlahPinjaman = jumlahPinjaman;
    }

    public LocalDate getTanggalGadai() {
        return tanggalGadai;
    }

    public void setTanggalGadai(LocalDate tanggalGadai) {
        this.tanggalGadai = tanggalGadai;
    }

    public LocalDate getTanggalJatuhTempo() {
        return tanggalJatuhTempo;
    }

    public void setTanggalJatuhTempo(LocalDate tanggalJatuhTempo) {
        this.tanggalJatuhTempo = tanggalJatuhTempo;
    }

    public String getKeteranganBarang() {
        return keteranganBarang;
    }

    public void setKeteranganBarang(String keteranganBarang) {
        this.keteranganBarang = keteranganBarang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getBunga() {
        return bunga;
    }

    public void setBunga(Double bunga) {
        this.bunga = bunga;
    }

    public Double getDenda() {
        return denda;
    }

    public void setDenda(Double denda) {
        this.denda = denda;
    }

    public Double getTotalTebusan() {
        return totalTebusan;
    }

    public void setTotalTebusan(Double totalTebusan) {
        this.totalTebusan = totalTebusan;
    }
}
