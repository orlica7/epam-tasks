package firstBlock.task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("Input 3 numbers (after every num tap Enter)");
            int a = InputNum();
            int b = InputNum();
            int c = InputNum();
            Compare(a,b,c);
            System.out.println("Again? (anything - yes, 'n' - no)");
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextLine().equals("n")) flag = false;
        }
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

    private static void Compare(int a, int b,int c){
        if ((a == b) & (b == c)) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
