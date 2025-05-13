package main.leet.daily;

public class AddSpaces {
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {8, 13, 15};
        System.out.println(addSpaces(s, spaces));
    }

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s.length() + spaces.length);
        int spaceIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (spaceIdx < spaces.length && i == spaces[spaceIdx]) {
                sb.append(' ');
                spaceIdx++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }


}
