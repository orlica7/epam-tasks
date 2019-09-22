package mainTask2;

import java.util.Scanner;

public class MyScanner {

    public static int inputTossNum(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter number of tosses (must be positive)");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }

    public static int inputNaturalNum(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a natural number");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }
}

