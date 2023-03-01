/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author xmuu
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("JFram pertama");
        JLabel username = new JLabel();
        JLabel password = new JLabel();
        JTextField usernameTxt = new JTextField();        
        JTextField passwordTxt = new JTextField();
        JButton loginButton = new JButton();
        
        username.setText("Username");
        username.setBounds(30, 30, 100, 30);        
        
        usernameTxt.setBounds(110, 30, 250, 30);
        passwordTxt.setBounds(110, 65, 250, 30);
        
        password.setText("Password");
        password.setBounds(30, 65, 100, 30);
        
        loginButton.setText("Login");
        loginButton.setBounds(260, 100, 100, 30);
        
        j.setSize(500, 500);        
        j.setVisible(true);        
        j.setLayout(null);        
        
        j.add(username);
        j.add(usernameTxt);
        j.add(password);
        j.add(passwordTxt);
        j.add(loginButton);
        
        
    }
    
}
