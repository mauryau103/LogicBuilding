package main.kunal.array;

public class ValidWord {
    public static void main(String[] args) {
        System.out.println(isValid("aya"));
    }

    public static boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        boolean isVowel = false;
        boolean isConst = false;
        boolean isNumber = false;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                isVowel = true;
            } else if (isConsonant(ch)) {
                isConst = true;
            } else if (isNumber(ch)) {
                isNumber = true;
            }
        }
        return isVowel && isConst && isNumber;
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }

    private static boolean isNumber(char c) {
        return "0123456789".indexOf(c) != -1;
    }

    private static boolean isConsonant(char c) {
        return "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(c) != -1;
    }
}
