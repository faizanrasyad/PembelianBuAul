package OOP.LatihanEnkapsulasi;

import java.util.Scanner;

public class TestTokoOnline {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TokoOnline to = new TokoOnline();

        System.out.print("Masukkan Nama: ");
        to.setNama(in.next());
        System.out.print("Masukkan Alamat: ");
        to.setAlamat(in.next());
        System.out.print("Masukkan Jenis Kelamin: ");
        to.setJk(in.next().charAt(0));
        System.out.print("Masukkan Saldo: ");
        to.saldo = in.nextInt();

        System.out.println();

        System.out.println("Nama: " + to.getNama());
        System.out.println("Alamat: " + to.getAlamat());
        System.out.println("Jenis Kelamin: " + to.getJk());
        System.out.println("Saldo: " + to.saldo);
    }
}