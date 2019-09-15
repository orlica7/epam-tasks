package firstBlock.task1;

import firstBlock.MyScanner;

public class task1 {
    public static void main(String[] args) {
            System.out.println("Input 3 numbers (after every num tap Enter)");
            int a = MyScanner.InputNum();
            int b = MyScanner.InputNum();
            int c = MyScanner.InputNum();
            Compare(a,b,c);
    }

    private static void Compare(int a, int b,int c){
        if ((a == b) & (b == c)) {
            System.out.println("All numbers are equal");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
