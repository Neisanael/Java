/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coba;

/**
 *
 * @author Neisan
 */
public class Pengarang {

    private String NIK;
    private String nama;
    private String alamat;

    public Pengarang(String NIK, String nama) {
        this.NIK = NIK;
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }
}
