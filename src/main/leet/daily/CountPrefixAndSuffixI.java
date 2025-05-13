package main.leet.daily;

public class CountPrefixAndSuffixI {
    public static void main(String[] args) {
        String[] str = {"pa", "papa", "ma", "mama"};
        System.out.println(countPrefixSuffixPairs(str));
    }

    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j]))
                    count++;
            }
        }
        return count;
    }

    public static boolean isPrefixAndSuffix(String str1, String str2) {
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}
