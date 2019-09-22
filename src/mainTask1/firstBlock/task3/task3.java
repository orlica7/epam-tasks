package mainTask1.firstBlock.task3;

import mainTask1.firstBlock.MyScanner;

public class task3 {
    public static void main(String[] args) {
        double R1;
        double R2;
        do{
            System.out.println("Input R1 and R2 (must be R1>R2)");
             R1 = MyScanner.inputRad();
             R2 = MyScanner.inputRad();
        }while (R1<R2);
        double S = Math.PI * (R1*R1-R2*R2);
        System.out.println("Square of the ring: " + S);
    }
}
