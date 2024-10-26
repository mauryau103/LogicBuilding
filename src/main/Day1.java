package main;

public class Day1 {
    public static void main(String[] args) {
//        System.out.println(checkNum(3));
//        System.out.println(checkPrime(13));
        System.out.println(validateYear(1900));
    }

    //1. Even or Odd
    //2. Prime Number
    //3. validation of leap years

    public static boolean checkNum(int num) {
        if (num % 2 == 0) {
            return true;
        } else return false;
    }

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

}
