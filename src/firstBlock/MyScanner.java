package firstBlock;

import java.util.Scanner;

public class MyScanner {

    public static double inputNum(){
        double number;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            System.out.println("Only integer");
            scanner.next();
        }
        number = scanner.nextDouble();
        return number;
    }

    public static double inputRad(){
        Scanner scanner = new Scanner(System.in);
        double number;
        do {
            System.out.println("Please enter a radius of the ring (must be positive)");
            while (!scanner.hasNextDouble()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextDouble();
        } while (number <= 0);
        return number;
    }

    public static double inputWeight(){
        Scanner scanner = new Scanner(System.in);
        double number;
        do {
            System.out.println("Please enter a weight of dinosaur (must be positive)");
            while (!scanner.hasNextDouble()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextDouble();
        } while (number <= 0);
        return number;
    }

    public static int inputFourDigNum(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive 4-digit number");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while ((number <= 0)|(((number/1000) == 0)|((number/10000) != 0)));
        return number;
    }

    public static int inputSixDigNum(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive 6-digit number");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while ((number <= 0)|(((number/100000) == 0)|((number/1000000) != 0)));
        return number;
    }

    public static int inputSevenDigNum(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a positive 7-digit number");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while ((number <= 0)|(((number/1000000) == 0)|((number/10000000) != 0)));
        return number;
    }
}
