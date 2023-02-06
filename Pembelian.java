package OOP.LatihanEnkapsulasi;

public class Pembelian {
    public int total, harga=2000;
    private int jumlah;

    public void setJumlah(int jumlahh){
        jumlah=jumlahh;
    }

    public int getJumlah(){
        return jumlah;
    }

    public int totalBelanja(int jumlah){
        total=harga*jumlah;
        return total;
    }
}
