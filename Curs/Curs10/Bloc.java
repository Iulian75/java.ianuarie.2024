package Curs.Curs10;

public class Bloc {

    String adresa;
    int numarCamere;
    double suprafata;
    boolean esteNou;

    public  Bloc(String adresa, int numarCamere,double suprafata,boolean esteNou){
        this.adresa = adresa;
        this.numarCamere = numarCamere;
        this.suprafata =suprafata;
        this.esteNou =esteNou;
    }

    public void afiseazaDetalii(){
        System.out.println("Adresa:" + adresa + "Numar camere:" + numarCamere + "Suprafata:" + suprafata + "Este nou:" + esteNou);

    }


}
