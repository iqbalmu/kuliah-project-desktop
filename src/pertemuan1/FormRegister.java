/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author xmuu
 */
public class FormRegister {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("Register Form");
        j.setSize(500, 500);        
        j.setVisible(true);        
        j.setLayout(null);  
        
        JLabel name = new JLabel();
        name.setText("Nama");
        name.setBounds(30, 30, 100, 30);        
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(30, 65, 100, 30);                        
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(30, 100, 100, 30);
        
        JLabel phone = new JLabel();
        phone.setText("Phone");
        phone.setBounds(30, 135, 100, 30);     
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(30, 170, 100, 30);                
        
        JLabel address = new JLabel();
        address.setText("address");
        address.setBounds(30, 205, 100, 30);     
        
        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(110, 30, 250, 30);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(110, 65, 250, 30);
        
        JPasswordField passwordTxt = new JPasswordField();        
        passwordTxt.setBounds(110, 100, 250, 30);
        
        JTextField emailTxt = new JTextField();        
        emailTxt.setBounds(110, 170, 250, 30);
        
        JTextField phoneTxt = new JTextField();
        phoneTxt.setBounds(110, 135, 250, 30);
        
        JTextArea addressTxt = new JTextArea();
        addressTxt.setBounds(110, 205, 250, 100);
        
        JButton loginButton = new JButton();                                                                                                   
        loginButton.setText("Login");
        loginButton.setBounds(110, 310, 250, 30);                      
        
        j.add(name);
        j.add(username);
        j.add(password);
        j.add(phone);
        j.add(email);
        j.add(nameTxt);
        j.add(usernameTxt);        
        j.add(passwordTxt);
        j.add(phoneTxt);
        j.add(emailTxt);        
        j.add(address);
        j.add(addressTxt);
        j.add(loginButton);
    }
    
}
