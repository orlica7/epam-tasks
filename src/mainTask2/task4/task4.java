package mainTask2.task4;

import mainTask2.MyScanner;

import java.util.LinkedHashSet;
import java.util.Set;

public class task4 {
    public static void main(String[] args) {
        int range = MyScanner.inputNaturalNum();
        Set<Integer> friendlyNums = new LinkedHashSet<>();
        findFriendlyNums(friendlyNums, range);
        output(friendlyNums);
    }

    private static int sumOfDividers(int number){
        int sum = 0;
        for (int i = 1; i < number; i++) sum += (number % i) == 0 ? i : 0;
        return sum;
    }

    private static void findFriendlyNums(Set<Integer> set, int range){
        int a;
        int b;
        for (int i = 1; i < range; i++){
            a = sumOfDividers(i);
            b = sumOfDividers(a);
            if (i==b && b!=a){
                set.add(i);
                set.add(a);
            }
        }
    }

    private static void output(Set<Integer> set){
        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }
}
