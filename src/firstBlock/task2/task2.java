package firstBlock.task2;

import firstBlock.MyScanner;

public class task2 {
    public static void main(String[] args) {
        double weight = MyScanner.inputWeight();
        double mg = weight * 1000000;
        double gr = weight * 1000;
        double tn = weight * 0.001;
        System.out.println("Dino weight:\n" + weight + " kg\n" + mg + " mg\n" + gr + " gr\n" + tn + " tn\n");
    }
}
