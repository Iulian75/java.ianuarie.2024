package Curs.Curs8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Person persoana1= new Person();
       // persoana1.name = "Alex";
       // persoana1.age = 20;
       // Person persoana2= new Person();
       // persoana2.name = "Alex2";
       // persoana2.age = 22;

      //  System.out.println("Varsta este: " + persoana1.age);
      //  if (persoana1.age == persoana2.age) {
     //       System.out.println("Varsta este diferita");

        //constructor:

        //Person persoana3 = new Person("Alex", 20);
        //System.out.println(persoana3.age);

        //Scanner scanner = new Scanner(System.in);
        //int numarUtilizator = scanner.nextInt();
        //System.out.println(numarUtilizator);

        Bloc bloc1=new Bloc(true,2000,7);
        Bloc bloc2=new Bloc(false,1999,12);
        Bloc bloc3=new Bloc(true,2009,12);

        Contract contract1= new Contract("public","electronic",12);
        Contract contract2= new Contract("prvat","electronic",15);
        Contract contract= new Contract("privat","electronic",20);

        Masina masina1= new Masina(2023,"blue","Audi");
        Masina masina2= new Masina(2020,"black","Mercedes");
        Masina masina3= new Masina(2015,"red","BMW");

        if (masina1.anfabricatie > 2020){
            System.out.println(masina1.model + "Este noua");
        }





    }
}
