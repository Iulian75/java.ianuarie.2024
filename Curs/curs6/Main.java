package Curs.curs6;

public class Main {

    public static void main(String[] args){
        System.out.println("start");

        //System.out.println(3==3.0);

        //**creare obiect =>instantiere */
        Animal animalObiect= new Animal();
        Animal pisica= new Animal();
        Animal caine= new Animal();

        //** nu se mai creeaza alta zona de memorie */

        Animal soarece = pisica;

        System.out.println(pisica==soarece);
        System.out.println(caine==soarece);

        int numarMasini = 10;
        if (numarMasini == 10) {
            System.out.println("Ai 10 masini");
        }





    }


}
