package firstBlock.task6;

import firstBlock.MyScanner;

public class task6 {
    public static void main(String[] args) {
        int N = MyScanner.InputSevenDigNum();
        int R = reverse(N);
        System.out.println(R);
    }

    private static int reverse(int value) {
        int result = 0;
        while(value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }
}
