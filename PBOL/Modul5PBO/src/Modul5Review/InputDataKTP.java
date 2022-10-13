package Modul5Review;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InputDataKTP extends JFrame implements ActionListener{

    private JLabel labelNip, labelNama, labelJenisKelamin, labelStatus, labelAgama, labelAlamat;
    private JTextField textNip, textNama;
    private JRadioButton radioLaki, radioPerempuan, radioMenikah, radioBelumMenikah;
    private ButtonGroup radioG1, radioG2;
    private JButton submit;
    private JComboBox agamaCB;
    private JTextArea alamatText;
    private JScrollPane scrollAlamat;
    private JPanel panelAlamat;
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 400;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int LABEL_WIDTH = 120;
    private static final int LABEL_HEIGTH = 30;
    private static final int TEXT_WIDTH = 280;
    private static final int TEXT_HEIGTH = 22;
    private static final int RADIO_WIDTH = 150;
    private static final int RADIO_HEIGTH = 20;
    private int clicked = 0;

    public static void main(String[] args) {
        InputDataKTP frame = new InputDataKTP();
        frame.setVisible(true);
    }

    private InputDataKTP() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Data KTP");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        initComponent();
        settingComponent();
        addComponent(contentPane);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initComponent() {
        labelNip = new JLabel("NIP : ");
        labelNama = new JLabel("Nama : ");
        labelJenisKelamin = new JLabel("Jenis Kelamin : ");
        labelStatus = new JLabel("Status : ");
        labelAgama = new JLabel("Agama : ");
        labelAlamat = new JLabel("Alamat : ");
        textNip = new JTextField();
        textNama = new JTextField();
        radioLaki = new JRadioButton("Pria");
        radioPerempuan = new JRadioButton("Wanita");
        radioMenikah = new JRadioButton("Menikah");
        radioBelumMenikah = new JRadioButton("Belum Menikah");
        radioG1 = new ButtonGroup();
        radioG2 = new ButtonGroup();
        submit = new JButton("Submit");
        agamaCB = new JComboBox();
        alamatText = new JTextArea(6, 24);
        panelAlamat = new JPanel();
        scrollAlamat = new JScrollPane(alamatText);
    }
    
    private void settingComponent(){
        radioLaki.setActionCommand("Pria");
        radioPerempuan.setActionCommand("Wanita");
        radioMenikah.setActionCommand("Menikah");
        radioBelumMenikah.setActionCommand("Belum Menikah");
        
        panelAlamat.setBorder(BorderFactory.createLineBorder(Color.black));
        scrollAlamat.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
        panelAlamat.add(scrollAlamat);
        agamaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Islam", "Hindu", "Buddha", "Kristen", "Katholik", "Konghucu"}));
        radioG1.add(radioLaki);
        radioG1.add(radioPerempuan);
        radioG2.add(radioMenikah);
        radioG2.add(radioBelumMenikah);
        
        labelNip.setBounds(20, 10, LABEL_WIDTH, LABEL_HEIGTH);
        labelNama.setBounds(20, 40, LABEL_WIDTH, LABEL_HEIGTH);
        labelJenisKelamin.setBounds(20, 70, LABEL_WIDTH, LABEL_HEIGTH);
        labelStatus.setBounds(20, 117, LABEL_WIDTH, LABEL_HEIGTH);
        labelAgama.setBounds(20, 170, LABEL_WIDTH, LABEL_HEIGTH);
        labelAlamat.setBounds(20, 200, LABEL_WIDTH, LABEL_HEIGTH);
        textNip.setBounds(150, 15, TEXT_WIDTH, TEXT_HEIGTH);
        textNama.setBounds(150, 45, TEXT_WIDTH, TEXT_HEIGTH);
        radioLaki.setBounds(150, 76, RADIO_WIDTH, RADIO_HEIGTH);
        radioPerempuan.setBounds(150, 100, RADIO_WIDTH, RADIO_HEIGTH);
        radioMenikah.setBounds(150, 124, RADIO_WIDTH, RADIO_HEIGTH);
        radioBelumMenikah.setBounds(150, 148, RADIO_WIDTH, RADIO_HEIGTH);
        agamaCB.setBounds(150, 177, 120, TEXT_HEIGTH);
        panelAlamat.setBounds(150, 207, 285, 100);
        submit.setBounds(150, 310, 90, 25);
        
        submit.addActionListener(this);
    }
    
    private void addComponent(Container p){
        p.add(labelNip);
        p.add(labelNama);
        p.add(labelJenisKelamin);
        p.add(labelStatus);
        p.add(labelAgama);
        p.add(labelAlamat);
        p.add(textNip);
        p.add(textNama);
        p.add(radioLaki);
        p.add(radioPerempuan);
        p.add(radioMenikah);
        p.add(radioBelumMenikah);
        p.add(submit);
        p.add(agamaCB);
        p.add(panelAlamat);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        clicked++;
        String nip = textNip.getText();
        String nama = textNama.getText();
        String jenisKelamin = radioG1.getSelection().getActionCommand();
        String status = radioG2.getSelection().getActionCommand();
        String agama = agamaCB.getSelectedItem().toString();
        String alamat = alamatText.getText();
        System.out.println("Data ke - "+clicked);
        System.out.println("NIP\t\t: "+nip);
        System.out.println("Nama\t\t: "+nama);
        System.out.println("Jenis Kelamin\t: "+jenisKelamin);
        System.out.println("Status\t\t: "+status);
        System.out.println("Agama\t\t: "+agama);
        System.out.println("Alamat\t\t: "+alamat);
        TampilKTP newFrame = new TampilKTP(nip, nama, jenisKelamin, status, agama, alamat);
    }
}
