package firstBlock.task3;

import java.util.Scanner;
import java.lang.Math;

public class task3 {
    public static void main(String[] args) {
        int R1;
        int R2;
        do{
            System.out.println("Input R1 and R2 (must be R1>R2)");
             R1 = InputRad();
             R2 = InputRad();
        }while (R1<R2);
        double S = Math.PI * (R1*R1-R2*R2);
        System.out.println("Square of the ring: " + S);
    }

    private static int InputRad(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a radius of the ring (must be positive)");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }
}
