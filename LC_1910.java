public class LC_1910 {
    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)) { // Keep removing while part exists in s
            s = s.replaceFirst(part, ""); // Remove first occurrence of part
        }
        return s;
    }
}
