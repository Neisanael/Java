package Modul5Review;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class inputDataAbsen extends JFrame implements ActionListener {

    private JLabel labelNim, labelNama, labelMataKuliah, labelJumlahPertemuan, labelJumlahKehadiran;
    private JTextField textNim, textNama, textJumlahPertemuan, textJumlahKehadiran;
    private JComboBox mataKuliahCB;
    private JButton buttonCheck;
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int LABEL_WIDTH = 150;
    private static final int LABEL_HEIGTH = 30;

    public static void main(String[] args) {
        inputDataAbsen frame = new inputDataAbsen();
        frame.setVisible(true);
    }

    private inputDataAbsen() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Input Data Absen");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        initComponent();
        settingComponent();
        addComponent(contentPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponent() {
        labelNim = new JLabel("NIM");
        labelNama = new JLabel("Nama");
        labelMataKuliah = new JLabel("Mata Kuliah");
        labelJumlahPertemuan = new JLabel("Jumlah Pertemuan");
        labelJumlahKehadiran = new JLabel("Jumlah Kehadiran");
        textNim = new JTextField();
        textNama = new JTextField();
        textJumlahPertemuan = new JTextField();
        textJumlahKehadiran = new JTextField();
        mataKuliahCB = new JComboBox();
        buttonCheck = new JButton("Check");
    }

    private void settingComponent() {
        mataKuliahCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Pemrograman Berorientasi Obyek 2", "Struktur Data Linear", "Bahasa Query", "Internet dan Aplikasinya"}));
        labelNim.setBounds(20, 10, LABEL_WIDTH, LABEL_HEIGTH);
        labelNama.setBounds(20, 40, LABEL_WIDTH, LABEL_HEIGTH);
        labelMataKuliah.setBounds(20, 70, LABEL_WIDTH, LABEL_HEIGTH);
        labelJumlahPertemuan.setBounds(20, 100, LABEL_WIDTH, LABEL_HEIGTH);
        labelJumlahKehadiran.setBounds(20, 130, LABEL_WIDTH, LABEL_HEIGTH);
        textNim.setBounds(180, 10, 200, 22);
        textNama.setBounds(180, 40, 200, 22);
        mataKuliahCB.setBounds(180, 70, 340, 22);
        textJumlahPertemuan.setBounds(180, 100, 80, 22);
        textJumlahKehadiran.setBounds(180, 130, 80, 22);
        buttonCheck.setBounds(180, 160, 80, 25);
        
        buttonCheck.addActionListener(this);
    }
    
    private void addComponent(Container p){
        p.add(labelNim);
        p.add(labelNama);
        p.add(labelMataKuliah);
        p.add(labelJumlahPertemuan);
        p.add(labelJumlahKehadiran);
        p.add(textNim);
        p.add(textNama);
        p.add(mataKuliahCB);
        p.add(textJumlahPertemuan);
        p.add(textJumlahKehadiran);
        p.add(buttonCheck);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String nim = textNim.getText();
        String nama = textNama.getText();
        String mataKuliah = mataKuliahCB.getSelectedItem().toString();
        String jumlahPertemuan = textJumlahPertemuan.getText();
        String jumlahKehadiran = textJumlahKehadiran.getText();
        double i = Integer.parseInt(jumlahPertemuan);
        double j = Integer.parseInt(jumlahKehadiran);
        double n = j/i*100;
        String presentaseKehadiran = String.valueOf(n+"%");
        String status;
        if(n < 75){
            status = "Tidak Memenuhi";
        }else{
            status = "Memenuhi";
        }
        statusAbsensi frame = new statusAbsensi(nim, nama, mataKuliah, jumlahPertemuan, jumlahKehadiran, presentaseKehadiran, status);
    }
}
