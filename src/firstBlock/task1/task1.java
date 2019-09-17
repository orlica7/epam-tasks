package firstBlock.task1;

import firstBlock.MyScanner;

public class task1 {
    public static void main(String[] args) {
            System.out.println("Input 3 numbers (after every num tap Enter)");
            double a = MyScanner.inputNum();
            double b = MyScanner.inputNum();
            double c = MyScanner.inputNum();
            compare(a,b,c);
    }

    private static void compare(double a, double b,double c){
        if ((a == b) & (b == c)) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
