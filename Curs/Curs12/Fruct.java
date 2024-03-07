package Curs.Curs12;

public class Fruct {
    String nume;
    String culoare;
    double greutate;
    boolean cresreInCopac;

    Fruct(String nume, String culoare, double greutate, boolean cresteInCopac) {
        this.nume = nume;
        this.culoare = culoare;
        this.greutate = greutate;
        this.cresreInCopac = cresteInCopac;
    }
        void metodaCareRuleaza1(){
            System.out.println("Am rulat metoda1");
        }
        void metodaCareRuleaza2(){
            System.out.println("Am rulat metoda2");
        }

         String getNume(){
           return nume;
        }

         String getCuloare() {
            return culoare;
        }


    }


