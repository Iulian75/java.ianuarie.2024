package Curs.Curs11;

public class Main {
    public static void main(String[] args) {
//        //** am creat un obiect Floare=instanta */
//        Floare lalea = new Floare(3,"verde");
//
//       int numarul10 = lalea.metodaCareIntoarce10();
//       System.out.println(numarul10);
//    }


        // Creare obiecte pentru clasa Om
        Om om1 = new Om("Ion", 30, "masculin", 175.5);
        Om om2 = new Om();
        om2.setNume("Maria");
        om2.setVarsta(25);
        om2.setGen("feminin");
        om2.setInaltime(165.0);

        // Creare obiecte pentru clasa Contract
        Contract contract1 = new Contract(1001, "Company A", 5000.0, true);
        Contract contract2 = new Contract();
        contract2.setNumarContract(1002);
        contract2.setBeneficiar("Company B");
        contract2.setValoare(7000.0);
        contract2.setActiv(false);

        // Creare obiecte pentru clasa Student
        Student student1 = new Student("Alex", 20, "Informatică", true);
        Student student2 = new Student();
        student2.setNume("Ana");
        student2.setVarsta(22);
        student2.setSpecializare("Medicină");
        student2.setBursier(false);


//        -crearea a 3 clase: Om, Contract, Student.
//        -4 proprietati pentru fiecare clasa.
//        -2 constructori pentru fiecare clasa.
//        -getteri si setteri pentru fiecare clasa.
//       -2 obiecte pentru fiecare clasa pe care vom avea toate proprietatile setate.


    }
}
