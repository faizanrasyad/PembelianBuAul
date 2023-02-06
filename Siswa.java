package OOP.LatihanEnkapsulasi;

public class Siswa {
    private String nama, alamat;
    private int umur;

    public void setNama(String name){
        nama=name;
    }

    public void setAlamat(String address){
        alamat=address;
    }

    public void setUmur(int age){
        umur=age;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public int getUmur(){
        return umur;
    }
}
