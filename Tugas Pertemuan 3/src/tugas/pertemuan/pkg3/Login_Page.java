/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pertemuan.pkg3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

/**
 *
 * @author acer
 */
class KotakFrame extends JFrame{
    //inisiasi object untuk label
    JLabel tulisan = new JLabel("Selamat Datang!");
    JLabel tulisan2 = new JLabel("Silahkan Masuk Untuk Melanjutkan.");
    JLabel user = new JLabel("Username");
    JLabel pass = new JLabel("Password");
    JLabel gender = new JLabel("Jenis Kelamin");
    
    //inisiasi object untuk inputan text
    JTextField inputuser = new JTextField();
    JTextField inputpass = new JTextField();
    
    //inisiasi object untuk pilihan gender
    JRadioButton pilih1 = new JRadioButton("Laki-Laki");
    JRadioButton pilih2 = new JRadioButton("Perempuan");
    
    //inisiasi object untuk button
    JButton submit = new  JButton ("Login");
    
    KotakFrame(){
        setVisible(true);
        setSize(520, 480);
        setTitle("Belajar Bikin Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(tulisan);
        tulisan.setBounds(10, 0, 300, 40);
        tulisan.setFont(tulisan.getFont().deriveFont(30f));
        
        add(tulisan2);
        tulisan2.setBounds(10, 35, 300, 40);
        tulisan2.setFont(tulisan2.getFont().deriveFont(15f));
        
        add(user);
        user.setBounds(10, 80, 300, 40);
        user.setFont(user.getFont().deriveFont(15f));
        
        add(inputuser);
        inputuser.setBounds(10, 115, 490, 40);
        
        add(pass);
        pass.setBounds(10, 170, 300, 40);
        pass.setFont(pass.getFont().deriveFont(15f));
        
        add(inputpass);
        inputpass.setBounds(10, 205, 490, 40);
        
        add(gender);
        gender.setBounds(10, 260, 300, 40);
        gender.setFont(gender.getFont().deriveFont(15f));
        
        add(pilih1);
        pilih1.setBounds(15, 290, 300, 40);
        
        add(pilih2);
        pilih2.setBounds(230, 290, 300, 40);
        
        add(submit);
        submit.setBounds(10, 360, 490, 40);
    }
}
public class Login_Page {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KotakFrame kotakFrame = new KotakFrame();
    }
    
}
