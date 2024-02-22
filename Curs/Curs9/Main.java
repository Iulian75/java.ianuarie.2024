package Curs.Curs9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String varTest = "ceva";

        for (int index = 0; index < 10; index++) {
            System.out.println(index);
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un nr:");
        int numar = scanner.nextInt();

        int counterI = 0;
                int counterP=0;

        for (int x = 1; x <= numar; x++) {
            if (x % 2 == 0) {
                ++counterP;
            }else {
                ++counterI;
            }
        }
        System.out.println("Counter impare:" + counterI);
        System.out.println("Counter pare" + counterP);


        //ex 3

        int y=5;
        if (y>10) System.out.println("Numarul e mai mare decat 10");
        else System.out.println("Numarul nu e mai mare decat 10");



    }

}
