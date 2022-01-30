package Kolokwium;

public class Cukierek {
    int numerCukierka;
    String smak;

    public Cukierek(int numerCukierka, String smak){
        this.numerCukierka = numerCukierka;
        this.smak = smak;
    }

    public String toString(){
        return "Cukierek nr " + this.numerCukierka + " smak: " + this.smak;
    }
}
