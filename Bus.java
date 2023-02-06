package OOP.LatihanEnkapsulasi;

public class Bus {
    private double penumpang, maxpenumpang;

    public Bus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
    }

    public void pluspenumpang(int penumpang){
        double temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload Penumpang!!");
        }else{
            this.penumpang=temp;}
        }

    public void getPassword(int password){
        if(password==90){
            System.out.println("Password Benar!!");
        }else{
            System.out.println("Password Salah!!");
        }
    }
    

    public void cetak(){
        System.out.println("Penumpang Sekarang: "+penumpang);
        System.out.println("Penumpang Seharusnya Adalah: "+maxpenumpang);
    }
}
