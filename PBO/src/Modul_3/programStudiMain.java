package Modul_3;
import javax.swing.JOptionPane;
public class programStudiMain {
    public static void main(String[] args) {
    pegawai pgw = new pegawai("P1678", "Adi Bangun");
    pgw.setGelar("M.Sc");
    pgw.setEmail("adi@yahoo.com");
    programStudi pS = new programStudi("2153", "Informatika");
    JOptionPane.showMessageDialog(null, "Diketuai : "+pgw.getNama()+" No . "
            +pgw.getNIP(), "Prodi : "+pS.getNama_prodi(), JOptionPane.PLAIN_MESSAGE);
    }
}
