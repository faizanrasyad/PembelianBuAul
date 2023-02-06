package OOP.LatihanEnkapsulasi;

public class Customer {
    private String namaCusto, alamat;
    private int saldo;

    public void setNamaCusto(String namaCustoo){
        namaCusto=namaCustoo;
    }

    public String getNamaCusto(){
        return namaCusto;
    }

    public void setAlamat(String alamatt){
        alamat=alamatt;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setSaldo(int saldoo){
        saldo=saldoo;
    }

    public int getSaldo(){
        return saldo;
    }

    public int sisaSaldo(int total){
        saldo=saldo-total;
        return saldo;
    }
}
