package tugas.pertemuan.pkg3;

import bangundatar.persegi;
import bangunruang.balok;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Halaman_Utama extends JFrame implements ActionListener{
    //inisiasi object untuk label
    JLabel teks = new JLabel();
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
    
    Halaman_Utama(String username, String jeniskelamin){
        setVisible(true);
        setSize(550,520);
        setTitle("Halaman Utama");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String panggilan = (jeniskelamin == "l") ? "Mr. " : "Mrs. ";
        setLayout(null);
        add(teks);
        teks.setText("Welcome, " + panggilan + username);
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
        tombol.addActionListener(this);
        
        add(tombol1);
        tombol1.setBounds(10, 290, 510, 40);
        tombol1.setFont(tombol1.getFont().deriveFont(15f));
        tombol1.addActionListener(this);
        
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tombol){
            try{
                double ppanjang = Double.parseDouble(input.getText());
                double llebar = Double.parseDouble(input1.getText());
                double ttinggi = Double.parseDouble(input2.getText());

                if (ppanjang <= 0 || llebar <= 0 || ttinggi <= 0) {
                    throw new NumberFormatException("Input harus berupa angka positif");
                }

                persegi bangun1 = new persegi(ppanjang, llebar);
                balok bangun2 = new balok(ppanjang, llebar, ttinggi);

                String hasil_luas = String.valueOf(bangun1.Luas());
                String hasil_keliling = String.valueOf(bangun1.Keliling());
                String hasil_volume = String.valueOf(bangun2.Volume());
                String hasil_luas_permukaan = String.valueOf(bangun2.Luas_Permukaan());

                hasil1.setText(hasil_luas);
                hasil2.setText(hasil_keliling);
                hasil3.setText(hasil_volume);
                hasil4.setText(hasil_luas_permukaan);
            }catch (NumberFormatException ex) {
                // Tangkap pengecualian jika input tidak valid
                JOptionPane.showMessageDialog(this, "Input tidak valid: Masukkan angka positif.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == tombol1) {
            input.setText("");
            input1.setText("");
            input2.setText("");
            hasil1.setText("[Hasil berupa angka]");
            hasil2.setText("[Hasil berupa angka]");
            hasil3.setText("[Hasil berupa angka]");
            hasil4.setText("[Hasil berupa angka]");
        }
    }
}