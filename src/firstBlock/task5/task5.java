package firstBlock.task5;

import firstBlock.MyScanner;

public class task5 {
    public static void main(String[] args) {
        int N = MyScanner.InputSixDigNum();
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
}
