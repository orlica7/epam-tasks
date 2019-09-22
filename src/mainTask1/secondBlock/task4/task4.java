package mainTask1.secondBlock.task4;

import mainTask1.secondBlock.MyScanner;

public class task4 {
    public static void main(String[] args) {
        int day;
        System.out.println("Input a year");
        int year = MyScanner.inputPosIntNum();
        int month = MyScanner.inputMonth();
        if ((checkLeap(year)) & month == 2) {
            do {
                System.out.println("A day must be less then 30");
                day = MyScanner.inputDay();
            } while (day > 29);
        } else if ((!checkLeap(year)) & month == 2) {
            do {
                System.out.println("A day must be less then 29");
                day = MyScanner.inputDay();
            } while (day > 28);
        } else if ((month == 4 || month == 6 || month == 9 || month == 11)) {
            do {
                System.out.println("A day must be less then 31");
                day = MyScanner.inputDay();
            } while (day > 30);
        } else day = MyScanner.inputDay();
        nextDay(day, month, year);
    }

    private static void nextDay(int day, int month, int year) {
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        if (month == 2) {
            if ((checkLeap(year)) && day == 29) {
                nextDay = 1;
                nextMonth++;
            } else if ((!checkLeap(year)) && day == 28) {
                nextDay = 1;
                nextMonth++;
            } else {
                nextDay++;
            }
        } else {
            if((month==4 || month == 6 || month == 9 || month == 11) && day == 30){
                nextDay = 1;
                nextMonth++;
            }else if(month == 12 && day == 31){
                nextDay = 1;
                nextMonth = 1;
                nextYear++;
            }else if (day == 31){
                nextDay = 1;
                nextMonth++;
            }else {
                nextDay++;
            }
        }
        System.out.println("Next date is " + nextDay + "." + nextMonth + "." + nextYear);
    }

    private static boolean checkLeap(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
}

