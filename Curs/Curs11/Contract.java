package Curs.Curs11;

public class Contract {

    // Proprietăți
    private int numarContract;
    private String beneficiar;
    private double valoare;
    private boolean activ;

    // Constructori
    public Contract() {
        // Constructor implicit
    }

    public Contract(int numarContract, String beneficiar, double valoare, boolean activ) {
        this.numarContract = numarContract;
        this.beneficiar = beneficiar;
        this.valoare = valoare;
        this.activ = activ;
    }

    // Getteri și setteri
    public int getNumarContract() {
        return numarContract;
    }

    public void setNumarContract(int numarContract) {
        this.numarContract = numarContract;
    }

    public String getBeneficiar() {
        return beneficiar;
    }

    public void setBeneficiar(String beneficiar) {
        this.beneficiar = beneficiar;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    public boolean isActiv() {
        return activ;
    }

    public void setActiv(boolean activ) {
        this.activ = activ;
    }

}

