package mainTask2.task3;

import mainTask2.MyScanner;

public class task3 {
    public static void main(String[] args) {
        int naturalNum = MyScanner.inputNaturalNum();
        System.out.println("Is perfect: " + isPerfect(naturalNum));
    }

    private static boolean isPerfect(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) sum += (number % i) == 0 ? i : 0;
        return sum == number;
    }
}
