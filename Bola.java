package OOP.LatihanEnkapsulasi;

public class Bola {
    private double r, d, lp, vol;

    public void setJarijari(double jarijari){
        r=jarijari;
    }

    public double getJarijari(){
        return r;
    }

    public double showDiameter(){
        d=r*2;
        return d;
    }

    public double showLuasPermukaan(){
        lp=Math.PI*4*r*r;
        return lp;
    }

    public double showVolume(){
        vol=Math.PI*r*r*r*4/3;
        return vol;
    }
}
