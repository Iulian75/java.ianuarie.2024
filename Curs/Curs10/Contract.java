package Curs.Curs10;

public class Contract {
    String numeClient;
    int durataContract;
    double sumaPlatita;
    boolean esteActiv;

    public Contract(String numeClient, int durataContract, double sumaPlatita, boolean esteActiv) {
        this.numeClient = numeClient;
        this.durataContract = durataContract;
        this.sumaPlatita = sumaPlatita;
        this.esteActiv = esteActiv;
    }

    public void afisezaDetalii(){
        System.out.println("Nume client:" + numeClient + "Durata contract:" + durataContract + "Suma platita:" + sumaPlatita + "Este activ:"+ esteActiv);

    }

}
