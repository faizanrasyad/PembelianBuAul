package OOP.LatihanEnkapsulasi;

public class Barang {
    private String namaBarang;
    private int harga, stok;

    public String getNamaBarang(){
        namaBarang="Donat";
        return namaBarang;
    }

    public int getHarga(){
        harga=2000;
        return harga;
    }

    public int getStok(){
        stok=20;
        return stok;
    }
    
    public int sisaStok(int jumlah){
        stok=stok-jumlah;
        return stok;
    }
}
