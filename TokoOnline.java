package OOP.LatihanEnkapsulasi;

public class TokoOnline {
    private String nama, alamat;
    private char jk;
    int saldo;

    public void setNama(String namaa){
        nama=namaa;
    }

    public String getNama(){
        return nama;
    }

    public void setAlamat(String alamatt){
        alamat=alamatt;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setJk(char jkk){
        jk=jkk;
    }

    public char getJk(){
        return jk;
    }
}
