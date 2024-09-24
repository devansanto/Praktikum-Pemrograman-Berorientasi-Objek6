/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPraktikumPBO_6;

/**
 *
 * @author asus1
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja(3); //Kapasitas Keranjang 10 Produk
        
        //Tambah Produk
        keranjang.keranjangbelanja(new Buku("Buku Bobo", 100000));
        keranjang.keranjangbelanja(new Elektronik("Laptop",100000));
        keranjang.keranjangbelanja(new Pakaian("Jaket Kulit", 100000));
        
        keranjang.detailbarang();
        
        double totalHarga = keranjang.hitungHarga();
        System.out.println("Total Harga sebelum Diskon : " + totalHarga);
        double totalHargaDiskon = keranjang.hitungHargaDiskon();
        System.out.println("Total Harga sesudah Diskon : " + totalHargaDiskon);
    }
}