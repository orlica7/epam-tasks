package firstBlock.task4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int N = InputNum();
        int ones = N % 10;
        int tens = (N % 100 - ones)/10;
        int hund = (N % 1000 - tens - ones)/100;
        int thous = (N % 10000 - hund - tens - ones)/1000;
        Compare(thous,hund,tens,ones);
    }

    private static int InputNum(){
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

    private static void Compare(int a, int b, int c, int d){
        if ((a<b)&(b<c)&(c<d)) {
            System.out.println("Satisfies the condition of increase");
        }
        else if((a>b)&(b>c)&(c>d)){
            System.out.println("Satisfies the condition of decrease");
        }
        else {
            System.out.println("Do not satisfies any of 2 conditions");
        }
    }
}
