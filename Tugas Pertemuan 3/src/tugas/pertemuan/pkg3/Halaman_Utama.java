package tugas.pertemuan.pkg3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
class kotakframe extends JFrame {
    //inisiasi object untuk label
    JLabel teks = new JLabel("Welcome, [Mr/Mrs] [username]");
    JLabel teks2 = new JLabel("Tentukan panjang, lebar, dan tinggi untuk menghitung balok");
    JLabel panjang = new JLabel("Panjang");
    JLabel lebar = new JLabel("Lebar");
    JLabel tinggi = new JLabel("Tinggi");
    JLabel hasil = new JLabel("Hasil");
    JLabel luas = new JLabel("Luas Persegi");
    JLabel keliling = new JLabel("Keliling Persegi");
    JLabel volume = new JLabel("Volume Balok");
    JLabel luaspermukaan = new JLabel("Luas Permukaan Balok");
    JLabel hasil1 = new JLabel("[Hasil berupa angka]");
    JLabel hasil2 = new JLabel("[Hasil berupa angka]");
    JLabel hasil3 = new JLabel("[Hasil berupa angka]");
    JLabel hasil4 = new JLabel("[Hasil berupa angka]");
    
    //inisiasi object untuk inputan text
    JTextField input = new JTextField();
    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();
    
    //inisiasi object untuk button
    JButton tombol = new  JButton ("Hitung");
    JButton tombol1 = new  JButton ("Reset");
    
    kotakframe(){
        setVisible(true);
        setSize(550,520);
        setTitle("Buat Frame Baru");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(null);
        add(teks);
        teks.setBounds(10,0,500,40);
        teks.setFont(teks.getFont().deriveFont(30f));
        
        add(teks2);
        teks2.setBounds(10,38,500,25);
        teks2.setFont(teks2.getFont().deriveFont(15f));
        
        add(panjang);
        panjang.setBounds(10,90,150,25);
        panjang.setFont(panjang.getFont().deriveFont(15f));
        
        add(input);
        input.setBounds(150, 90, 370, 40);
        
        add(lebar);
        lebar.setBounds(10,140,150,25);
        lebar.setFont(lebar.getFont().deriveFont(15f));
        
        add(input1);
        input1.setBounds(150, 140, 370, 40);
        
        add(tinggi);
        tinggi.setBounds(10,190,150,25);
        tinggi.setFont(tinggi.getFont().deriveFont(15f));
        
        add(input2);
        input2.setBounds(150, 190, 370, 40);
        
        add(tombol);
        tombol.setBounds(10, 240, 510, 40);
        tombol.setFont(tombol.getFont().deriveFont(15f));
        
        add(tombol1);
        tombol1.setBounds(10, 290, 510, 40);
        tombol1.setFont(tombol1.getFont().deriveFont(15f));
        
        add(hasil);
        hasil.setBounds(245,330,180,40);
        hasil.setFont(hasil.getFont().deriveFont(15f));
        
        add(luas);
        luas.setBounds(10,350,150,40);
        luas.setFont(luas.getFont().deriveFont(15f));
        
        add(hasil1);
        hasil1.setBounds(250,350,200,40);
        hasil1.setFont(hasil1.getFont().deriveFont(15f));
        
        add(keliling);
        keliling.setBounds(10,380,150,40);
        keliling.setFont(keliling.getFont().deriveFont(15f));
        
        add(hasil2);
        hasil2.setBounds(250,380,200,40);
        hasil2.setFont(hasil2.getFont().deriveFont(15f));
        
        add(volume);
        volume.setBounds(10,410,150,40);
        volume.setFont(volume.getFont().deriveFont(15f));
        
        add(hasil3);
        hasil3.setBounds(250,410,200,40);
        hasil3.setFont(hasil3.getFont().deriveFont(15f));
        
        add(luaspermukaan);
        luaspermukaan.setBounds(10,440,200,40);
        luaspermukaan.setFont(luaspermukaan.getFont().deriveFont(15f));
        
        add(hasil4);
        hasil4.setBounds(250,440,200,40);
        hasil4.setFont(hasil4.getFont().deriveFont(15f));
    }
}
/**
 *
 * @author acer
 */
public class Halaman_Utama {
    public static void main(String[] args) {
    kotakframe Kotakframe =new kotakframe();
    }
}
