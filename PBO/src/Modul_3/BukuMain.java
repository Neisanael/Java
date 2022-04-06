package Modul_3;
import javax.swing.JOptionPane;
public class BukuMain {
    public static void main(String[] args) {
        penerbit pnb = new penerbit("","",0);
        Buku bk = new Buku("","","");
        String response;
        response = JOptionPane.showInputDialog("Kode Buku : ");
        bk.setKodeBuku(response);
        response = JOptionPane.showInputDialog("Judul Buku : ");
        bk.setJudul(response);
        response = JOptionPane.showInputDialog("Nama Pengarang Buku : ");
        bk.setNamaPengarang(response);
        response = JOptionPane.showInputDialog("Tahun Terbit Buku : ");
        int a = Integer.parseInt(response);
        pnb.setTahun_terbit(a);
        response = JOptionPane.showInputDialog("Nama Penerbit : ");
        pnb.setNama_penerbit(response);
        response = JOptionPane.showInputDialog("Alamat Penerbit : ");
        pnb.setAlamat_penerbit(response);
        JOptionPane.showMessageDialog(null, "Kode Buku : "+bk.getKodeBuku()+""
                + "\nJudul Buku : "+bk.getJudul()+""
                        + "\nNama Pengarang Buku : "+bk.getNamaPengarang()+""
                                + "\nTahun Terbit Buku : "+pnb.getTahun_terbit()+""
                                        + "\nNama Penerbit : "+pnb.getNama_penerbit()+""
                                                + "\nAlamat Penerbit : "+pnb.getAlamat_penerbit()+""
                                                        + "\n"+pnb.lamaBuku(),"BUKU",JOptionPane.PLAIN_MESSAGE);
    }
}
