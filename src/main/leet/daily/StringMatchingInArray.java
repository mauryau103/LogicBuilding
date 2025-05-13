package main.leet.daily;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInArray {
    public static void main(String[] args) {
        System.out.println(stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
    }

    public static List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) continue;
                if (words[i].contains(words[j]) && !ans.contains(words[j]))
                    ans.add(words[j]);
            }
        }
        return ans;
    }
}
