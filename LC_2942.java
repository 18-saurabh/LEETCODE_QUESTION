import java.util.ArrayList;
import java.util.List;
public class LC_2942 {
    public static int[] findsWordsContaining(String words[],char x){
        int tempIndices[]=new int[words.length];
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                    tempIndices[count]=i;
                    count++;
                    break;
                }
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = tempIndices[i];
        }
        return result;
    }

    public static List<Integer> findIndices(String[] words, char x) {
        // Initialize a list to hold the indices
        List<Integer> indices = new ArrayList<>();

        // Iterate through each word
        for (int i = 0; i < words.length; i++) {
            // Check if the word contains the character x
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    // Add the index to the list if x is found in the word
                    indices.add(i);
                    break; // Exit the inner loop once x is found in the word
                }
            }
        }

        return indices;
    }
    // public static void main(String[] args) {
    // String[] words1 = { "leet", "code" };
    // char x1 = 'e';
    // List<Integer> result1 = findIndices(words1, x1);
    // System.out.println(result1); // Output: [0, 1]

    // String[] words2 = { "abc", "bcd", "aaaa", "cbc" };
    // char x2 = 'a';
    // List<Integer> result2 = findIndices(words2, x2);
    // System.out.println(result2); // Output: [0, 2]

    // String[] words3 = { "abc", "bcd", "aaaa", "cbc" };
    // char x3 = 'z';
    // List<Integer> result3 = findIndices(words3, x3);
    // System.out.println(result3); // Output: []
    // }
        public static void main(String[] args) {
        String[] words1 = {"leet", "code"};
        char x1 = 'e';
        int[] result1 = findsWordsContaining(words1, x1);
        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println(); // Output: 0 1

        String[] words2 = {"abc", "bcd", "aaaa", "cbc"};
        char x2 = 'a';
        int[] result2 = findsWordsContaining(words2, x2);
        for (int i : result2) {
            System.out.print(i + " ");
        }
        System.out.println(); // Output: 0 2

        String[] words3 = {"abc", "bcd", "aaaa", "cbc"};
        char x3 = 'z';
        int[] result3 = findsWordsContaining(words3, x3);
        for (int i : result3) {
            System.out.print(i + " ");
        }
        System.out.println(); // Output: (empty)
    }
}

