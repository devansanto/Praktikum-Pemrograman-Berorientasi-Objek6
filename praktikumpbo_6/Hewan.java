/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo_6;

/**
 *
 * @author asus1
 */
public class Hewan {
    public void bersuara() {
        System.out.println("Hewan Bersuara");
    }
    public void makan(String makanan) {
        System.out.println("Hewan makan : " + makanan);
    }
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan : " + makanan +
                " Porsi " + jumlah);
    }
}
