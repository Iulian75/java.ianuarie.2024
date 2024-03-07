package Curs.Curs11;

public class Om {

    // Proprietăți
    private String nume;
    private int varsta;
    private String gen;
    private double inaltime;

    // Constructori
    public Om() {
        // Constructor implicit
    }

    public Om(String nume, int varsta, String gen, double inaltime) {
        this.nume = nume;
        this.varsta = varsta;
        this.gen = gen;
        this.inaltime = inaltime;
    }

    // Getteri și setteri
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getInaltime() {
        return inaltime;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }
}


