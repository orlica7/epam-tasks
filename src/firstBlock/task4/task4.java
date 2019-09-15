package firstBlock.task4;

import firstBlock.MyScanner;

public class task4 {
    public static void main(String[] args) {
        int N = MyScanner.InputFourDigNum();
        int ones = N % 10;
        int tens = (N % 100 - ones)/10;
        int hund = (N % 1000 - tens - ones)/100;
        int thous = (N % 10000 - hund - tens - ones)/1000;
        Compare(thous,hund,tens,ones);
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
