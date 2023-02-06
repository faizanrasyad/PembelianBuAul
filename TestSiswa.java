package OOP.LatihanEnkapsulasi;

public class TestSiswa {
    public static void main(String[] args) {
        Siswa s=new Siswa();
        s.setNama("Budi");
        s.setAlamat("Surabaya");
        s.setUmur(15);

        System.out.println("Nama: "+s.getNama()+" Beralamat di "+s.getAlamat()+" berumur "+s.getUmur()+ " tahun");
    }
}
