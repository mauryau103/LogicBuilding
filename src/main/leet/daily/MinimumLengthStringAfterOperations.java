package main.leet.daily;

public class MinimumLengthStringAfterOperations {
    public static void main(String[] args) {
        System.out.println(minimumLength("abaacbcbb"));
    }

    public static int minimumLength(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            count[idx]++;
        }
        int ans = 0;
        for (int occ : count) {
            if (occ == 0) continue;
            if (occ % 2 == 0) {
                ans += 2;
            } else ans += 1;
        }
        return ans;
    }
}
