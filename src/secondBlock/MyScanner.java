package secondBlock;

import java.util.Scanner;

public class MyScanner {

    public static double inputPosNum(){
        Scanner scanner = new Scanner(System.in);
        double number;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextDouble();
        } while (number <= 0);
        return number;
    }

    public static int inputPosIntNum(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }

    public static char inputChar(){
        char c;
        do{
        System.out.println("Input the only letter from latin alphabet");
        Scanner scanner = new Scanner(System.in);
        c = scanner.next().charAt(0);
        } while (((c<65)|(c>90))&((c<97)|c>122));
        return c;
    }

    public static int inputDay(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input a day");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while ((number <= 0)||(number > 31));
        return number;
    }

    public static int inputMonth(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Input a month");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while ((number <= 0)||(number > 12));
        return number;
    }
}
