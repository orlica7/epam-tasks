package mainTask1.secondBlock.task1;

import mainTask1.secondBlock.MyScanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Input x1:");
        double x1 = MyScanner.inputPosNum();
        System.out.println("y1:");
        double y1 = MyScanner.inputPosNum();
        System.out.println("x2:");
        double x2 = MyScanner.inputPosNum();
        System.out.println("y2:");
        double y2 = MyScanner.inputPosNum();
        System.out.println("x3:");
        double x3 = MyScanner.inputPosNum();
        System.out.println("y3:");
        double y3 = MyScanner.inputPosNum();
        checkTriangle(x1,y1,x2,y2,x3,y3);
    }

    private static double calcSideOfTriangle(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }

    private static void checkTriangle(double x1, double y1, double x2, double y2, double x3,
                                      double y3){
        double a = calcSideOfTriangle(x1,y1,x2,y2);
        double b = calcSideOfTriangle(x1,y1,x3,y3);
        double c = calcSideOfTriangle(x2,y2,x3,y3);
        if ((a<b+c)&(b<a+c)&(c<a+b)){
            System.out.println("The figure is triangle");
            checkStraight(a,b,c);

        } else System.out.println("The figure is not triangle");
    }

    private static void checkStraight(double a, double b, double c){
        double hypo;
        double cath1;
        double cath2;

        if ((a>b)&(a>c)){
            hypo = a;
            cath1 = b;
            cath2 = c;
        } else if (b>c){
            hypo = b;
            cath1 = a;
            cath2 = c;
        } else {
            hypo = c;
            cath1 = a;
            cath2 = b;
        }

        if ((Math.pow(hypo,2) == Math.pow(cath1,2) + Math.pow(cath2,2))) {
            System.out.println("And it is also straight");
        }
    }
}
