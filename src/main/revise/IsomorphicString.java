package main.revise;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null)
            return false;
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            if (map.containsValue(t.charAt(i)) && !map.containsKey(s.charAt(i))) {
                return false;
            }
            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }
}