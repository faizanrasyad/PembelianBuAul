package OOP.LatihanEnkapsulasi;

import java.util.Scanner;

public class TestPembelian {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        Customer c=new Customer();
        Barang b=new Barang();
        Pembelian p=new Pembelian();

        System.out.print("Masukkan Nama Kamu: ");
        c.setNamaCusto(in.next());
        System.out.print("Masukkan Alamat Kamu: ");
        c.setAlamat(in.next());
        System.out.print("Masukkan Jumlah Saldo Kamu: ");
        c.setSaldo(in.nextInt());
        System.out.print("Masukkan Jumlah Barang Yang Ingin Dibeli: ");
        p.setJumlah(in.nextInt());

        System.out.println();
        
        System.out.println("Nama Barang: "+b.getNamaBarang());
        System.out.println("Harga Barang: "+b.getHarga());
        System.out.println("Stok Barang: "+b.getStok());
        System.out.println("------------------------------------------");   
        System.out.println("Nama: "+c.getNamaCusto());
        System.out.println("Alamat: "+c.getAlamat());       
        System.out.println("Saldo Awal: "+c.getSaldo());
        System.out.println("===========================================");
        System.out.println("Jumlah Pembelian: "+p.getJumlah());
        System.out.println("Total Harga: "+p.totalBelanja(p.getJumlah()));
        System.out.println("Sisa Stok: "+b.sisaStok(p.getJumlah()));
        System.out.println("Sisa Saldo: "+c.sisaSaldo(p.totalBelanja(p.getJumlah())));
    }
}
