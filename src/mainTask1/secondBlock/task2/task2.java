package mainTask1.secondBlock.task2;

import mainTask1.secondBlock.MyScanner;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Input the age of the dragon");
        int n = MyScanner.inputPosIntNum();
        if (n<=200){
            n = n * 3 + 3;
        } else if (n<=300){
            n = 200*3 + (n-200)*2 + 3;
        } else n = 200 * 3 + 100 * 2 + (n-300) + 3;
        System.out.println("The dragon has " + n + " heads and " + (n * 2) + " eyes." );
    }
}
