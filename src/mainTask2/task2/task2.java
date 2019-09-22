package mainTask2.task2;

import mainTask2.MyScanner;

import java.util.HashSet;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Main number: ");
        int naturalNum = MyScanner.inputNaturalNum();
        System.out.println("Second number: ");
        int secondNaturalNum = MyScanner.inputNaturalNum();
        Set<Integer> set = new HashSet<>();
        Set<Integer> primeDividers = new HashSet<>();
        getDigits(naturalNum, set);
        output(naturalNum, secondNaturalNum, set, primeDividers);
    }

    private static Integer biggestDigit(Set<Integer> set){
        int tmp = 0;
        for (Integer i : set) {
            if (tmp < i){
                tmp = i;
            }
        }
        return tmp;
    }

    private static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n != 0) {
            reversed = (reversed * 10) + (n % 10);
            n /= 10;
        }
        return reversed == original;
    }

    private static boolean isPrime(int n) {
        if (n < 2){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static Set<Integer> primeDividers(int N, Set<Integer> set){
        set.add(1);
        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0){
                set.add(i);
                N /= i;
            }
        }
        if (N != 1){
            set.add(N);
        }
        return set;
    }

    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b,a % b);
    }

    private static int lcm(int a, int b){
        return a / gcd(a,b) * b;
    }

    private static void getDigits(int N, Set<Integer> set){
        for (int i = N; i > 0; i /= 10) {
            set.add(i % 10);
        }
    }

    private static void output(int N1, int N2, Set<Integer> set, Set<Integer> primeDividers){
        System.out.println("The biggest digit: " + biggestDigit(set));
        System.out.println("Is palindrome: " + isPalindrome(N1));
        System.out.println("Is prime: " + isPrime(N1));
        System.out.print("Prime delimeters: ");
        for (Integer i : primeDividers(N1, primeDividers)) {
            System.out.print(i + " ");
        }
        System.out.println("\nGCD: " + gcd(N1, N2));
        System.out.println("LCM: " + lcm(N1, N2));
        System.out.println("Number of different digits: " + set.size());
    }

}
