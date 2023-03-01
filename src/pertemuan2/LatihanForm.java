/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author xmuu
 */
public class LatihanForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Form Pengaduan Mahasiswa");
        frame.setSize(500,400);
        frame.setVisible(true);
        frame.setLayout(null);
        
        JLabel title = new JLabel();
        title.setText("Form Pengaduan Mahasiswa TRPL");        
        title.setBounds(150, 15, 250, 30);
        frame.add(title);
        
        JLabel name = new JLabel();
        name.setText("Nama");
        name.setBounds(30, 65, 100, 30);
        frame.add(name);
        
        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(150, 65, 300, 30);
        frame.add(nameTxt);
        
        JLabel nim = new JLabel();
        nim.setText("NIM");
        nim.setBounds(30, 100, 100, 30);
        frame.add(nim);
        
        JTextField nimTxt = new JTextField();
        nimTxt.setBounds(150, 100, 300, 30);
        frame.add(nimTxt);
        
        JLabel kelas = new JLabel();
        kelas.setText("Kelas");
        kelas.setBounds(30, 170, 100, 30);
        frame.add(kelas);
        
        String[] aKelas = {"2TRPLA", "2TRPLB", "2TRPLC"};
        JComboBox kelasCb = new JComboBox(aKelas);
        kelasCb.setBounds(150, 170, 300, 30);
        frame.add(kelasCb);
        
        JLabel jk = new JLabel();
        jk.setText("Jenis Kelamin");
        jk.setBounds(30, 135, 100, 30);
        frame.add(jk);                                
                
        JRadioButton jkRb1 = new JRadioButton("Laki-Laki");
        JRadioButton jkRb2 = new JRadioButton("Perempuan");
        jkRb1.setBounds(150, 135, 100, 30);
        jkRb2.setBounds(250, 135, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jkRb1);bg.add(jkRb2);
        frame.add(jkRb1);frame.add(jkRb2);
        
        JLabel message = new JLabel();
        message.setText("Pesan");
        message.setBounds(30, 205, 100, 30);
        frame.add(message);  
        
        JTextArea messageTa = new JTextArea();
        messageTa.setBounds(150, 205, 300, 100);
        frame.add(messageTa);
        
        JButton search = new JButton();
        search.setText("Cari");
        search.setBounds(150, 310, 300, 30);
        frame.add(search);
    }
    
}
