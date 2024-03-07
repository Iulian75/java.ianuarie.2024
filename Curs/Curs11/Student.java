package Curs.Curs11;

public class Student {

    // Proprietăți
    private String nume;
    private int varsta;
    private String specializare;
    private boolean bursier;

    // Constructori
    public Student() {
        // Constructor implicit
    }

    public Student(String nume, int varsta, String specializare, boolean bursier) {
        this.nume = nume;
        this.varsta = varsta;
        this.specializare = specializare;
        this.bursier = bursier;
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

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public boolean isBursier() {
        return bursier;
    }

    public void setBursier(boolean bursier) {
        this.bursier = bursier;
    }
}


