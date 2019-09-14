package firstBlock.task5;

import java.util.Scanner;
import java.lang.Math;

public class task5 {
    public static void main(String[] args) {
        int N = InputNum();
        int a = N % 10;
        int b= (N % 100 - a)/10;
        int c = (N % 1000 - b - a)/100;
        int d = (N % 10000 - c - b - a)/1000;
        int e = (N % 100000 - d - c - b - a)/10000;
        int f = (N % 1000000 - e - d - c - b - a)/100000;
        double avAr = (a+b+c+d+e+f)/6.0;
        double avGeo = Math.pow((a*b*c*d*e*f),1.0/6.0);
        System.out.println("Average Arith = " + avAr + "\n" + "Average Geo = " + avGeo);
    }

    private static int InputNum(){
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
}
