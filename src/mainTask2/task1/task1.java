package mainTask2.task1;

import mainTask2.MyScanner;

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int N = MyScanner.inputTossNum();
        Toss toss = new Toss();
        tossing(N, toss);
        System.out.format("Heads: %d%n" + "Tails: %d", toss.getHeads(), toss.getTails());
    }

    private static void tossing(int N, Toss toss){
        boolean sideOfCoin;
        Random random = new Random();
        for (int i = 0; i < N; i++){
            sideOfCoin = random.nextBoolean();
            if (sideOfCoin) {
                toss.setHeads(toss.getHeads() + 1);
            } else{
                toss.setTails(toss.getTails() + 1);
            }
        }
    }
}
