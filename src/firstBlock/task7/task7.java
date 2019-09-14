package firstBlock.task7;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        System.out.println("Input 2 integer numbers (after every num tap Enter)");
        int a = InputNum();
        int b = InputNum();
        a = a + b;
        b = b - a;
        b = -b;
        a = a -b;
        System.out.println("a = " + a + "\n" + "b = " + b);
    }

    private static int InputNum(){
        int number;
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Only integer");
            scanner.next();
        }
        number = scanner.nextInt();
        return number;
    }
}
