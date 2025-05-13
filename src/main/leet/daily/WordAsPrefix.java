package main.leet.daily;

public class WordAsPrefix {
    public static void main(String[] args) {
        String sentence = "i love eating burger", searchWord = "burg";
        System.out.println(isPrefixOfWord(sentence, searchWord));
        System.out.println("-------------------------");

    }

    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }

    public static int countPrefixes(String[] words, String s) {
        int cout = 0;
        for (String word : words) {
            if (s.startsWith(word))
                cout++;
        }
        return cout;
    }
}
