package secondBlock.task3;

import secondBlock.MyScanner;

public class task3 {
    public static void main(String[] args) {
        char c = MyScanner.inputChar();
        checkVowelFirst(c);
        checkVowelSecond(c);
        checkVowelThird(c);
        checkVowelFourth(c);
    }

    private static void checkVowelFirst(char c){
        if ((c == 65)||(c == 97)||(c == 69)||(c == 101)||(c == 73)||(c == 105)||(c == 79)
                ||(c == 111)||(c == 85)||(c == 117)){
            System.out.println(c + " is vowel");
        } else System.out.println(c + " is not vowel");
    }

    private static void checkVowelSecond(char c){
        c = Character.toLowerCase(c);
        if ((c == 'a')||(c == 'e')||(c == 'i')||(c == 'o')||(c == 'u')){
            System.out.println(c + " is vowel");
        } else System.out.println(c + " is not vowel");
    }

    private static void checkVowelThird(char c){
        switch (Character.toLowerCase(c)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c + " is vowel");
                break;
            default:
                System.out.println(c + " is not vowel");
        }
    }

    private static void checkVowelFourth(char c){
        String vowels = "AEIOU";
        if (vowels.indexOf(Character.toUpperCase(c)) >= 0){
            System.out.println(c + " is vowel");
        } else System.out.println(c + " is not vowel");
    }
}
