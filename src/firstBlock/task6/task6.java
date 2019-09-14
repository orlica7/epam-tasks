package firstBlock.task6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int N = InputNum();
        int R = inverse(N);
        System.out.println(R);
    }

    private static int inverse(int value) {
        int result = 0;
        while(value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }

    private static int InputNum(){
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
