package Curs.Curs10;

public class Main {
    public static void main(String[] args) {

        //exemplu break

//        for (int i = 0; i<=10;i++){
//            System.out.println(i);
//            /** PAR */
//            if (i%2== 0){
//                System.out.println("Am gasit nr par:"+ i);
//                break;
//            }
//        }

        //exemplu continue

//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//            /** PAR */
//            if (i % 2 == 0) {
//                System.out.println("Am gasit nr par:" + i);
//                continue;
//            }
//            System.out.println("Am trecut de continue");
//
//        }

        Bloc bloc = new Bloc("Strada X, nr. 10", 3, 150.5, true);
        Contract contract = new Contract("John Doe", 12, 500.0, true);
        Laptop laptop = new Laptop("HP Pavilion", 2021, 15.6, true);


        for (int index = 10; index >= 0; index--) {
            System.out.println("Indexul este: " + index);

            if (index == 3) {
                System.out.println("Indexul a ajuns la valoarea 3!");
                break;
            }



        }
    }
}