package Kolokwium;

public class Fabryka {
    String smak;
    int numerCukierka=1;

    public Fabryka(String smak){
        this.smak = smak;
    }
    public Cukierek[] produkuj(int iloscCukierkow){
        Cukierek[] cukierek = new Cukierek[iloscCukierkow];
        System.out.println("Produkcja " + iloscCukierkow + " o smaku: " + this.smak);
        int licznik = 1;
        for(int i = 0; i< iloscCukierkow; i++){
            if(licznik >= 5){
                System.out.println("Wyprodukowano " + licznik + " cukierków");
                licznik = 0;
            }
            licznik ++;
            if(i<5){
                cukierek[i] = new Cukierek(this.numerCukierka++, this.smak+"ll");
            }
            else {
                cukierek[i] = new Cukierek(this.numerCukierka++, this.smak);
            }
        }
        return cukierek;
    }
}
