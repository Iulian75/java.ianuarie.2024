package Curs.Curs11;

public class Floare {
    int numarPetale;
    String culoare;
    String miros;
    boolean areGhiveci;

    //constructor

       Floare(){
           this.miros = "de trandafir";

}
      Floare(int numarPetaleParam, String culoareParam){
          this.numarPetale=numarPetaleParam;
          this.culoare=culoareParam;
          System.out.println("Am apelat constr cu 2 param");
      }

      Floare(int numarPetaleParam){
          this.numarPetale = numarPetaleParam;
      }

      //Metode

    int metodaCareIntoarce10(){
          return 10;
    }

    String metodaCareIntoarceString(){
          return "Returnez String";
    }

    void metodaCareNuReturneaza(){
          System.out.println("Metoda nu returneaza nimic");
    }

    //Getter

    int getNumarPetale(){
          return numarPetale;
    }

    void setNumarPetale(int numarPetaleParametru){
          this.numarPetale = numarPetaleParametru;
    }





}