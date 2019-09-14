package firstBlock.task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int weight = InputWeight();
        long mg = weight * 1000000L;
        int gr = weight * 1000;
        double tn = weight * 0.001;
        System.out.println("Dino weight:\n" + weight + " kg\n" + mg + " mg\n" + gr + " gr\n" + tn + " tn\n");
    }

    private static int InputWeight(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter a weight of dinosaur (must be positive)");
            while (!scanner.hasNextInt()) {
                System.out.println("That not a number!");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }
}
