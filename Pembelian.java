package OOP.LatihanEnkapsulasi;

public class Pembelian {
    public int total;
    private int jumlah;
    Barang b=new Barang();

    public void setJumlah(int jumlahh){
        jumlah=jumlahh;
    }

    public int getJumlah(){
        return jumlah;
    }

    public int totalBelanja(int jumlah){
        total=b.getHarga()*jumlah;
        return total;
    }
}
