/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balok;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Balok {

    public static void main(String[] args) {
        int panjang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang"));
        int lebar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar"));
        int tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi"));
        
        int hitung = panjang * lebar * tinggi;
        
        String hasil = "Luas Permukaan Balok : " + hitung;
        JOptionPane.showMessageDialog(null, hasil, "Hasil", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
