package main.leet.daily;

public class RemoveOccurrence {
    public static void main(String[] args) {
        System.out.println(removeOccurrences("axxxxyyyyb", "xy"));
    }

    public static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb.append(ch);
            removeChar(part, sb);
        }
        removeChar(part, sb);
        return sb.toString();
    }

    public static void removeChar(String part, StringBuilder sb) {
        int l = part.length();
        if (sb.length() > l - 1) {
            String str = sb.substring(sb.length() - l, sb.length());
            if (!str.isEmpty() && str.equals(part))
                sb.delete(sb.length() - l, sb.length());
        }
    }
}
