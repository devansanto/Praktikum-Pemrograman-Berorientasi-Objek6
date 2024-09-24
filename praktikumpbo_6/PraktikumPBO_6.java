/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikumpbo_6;

/**
 *
 * @author asus1
 */
public class PraktikumPBO_6 {

    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.bersuara();
        kucing.makan("Ikan");
        kucing.makan("Ikan", 2);
        
        Anjing anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("Daging",3);
    }
}