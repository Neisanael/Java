/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

public class Mahasiswa implements Comparable {

    int nim;
    String nama;

    public Mahasiswa() {

    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int compareTo(Object o) {
        if (nim == ((Mahasiswa) o).nim) {
            return 0;
        } else if (((Mahasiswa) o).nim <= nim) {
            return 1;
        }
        return -1;
    }

    //tostring menjadi object
    @Override
    public String toString() {
        return "Nim : " + nim + " Nama : " + nama;
    }
}
