package firstBlock.task7;

import firstBlock.MyScanner;

public class task7 {
    public static void main(String[] args) {
        System.out.println("Input 2 integer numbers (after every num tap Enter)");
        int a = MyScanner.InputNum();
        int b = MyScanner.InputNum();
        changeNums(a,b);
    }

    private static void changeNums(int a, int b){
        a = a + b;
        b = b - a;
        b = -b;
        a = a -b;
        System.out.println("a = " + a + "\n" + "b = " + b);
    }
}
