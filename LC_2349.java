import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class LC_2349 { // The filename should match this class name

    private Map<Integer, Integer> indexMap; // Maps index -> number
    private Map<Integer, TreeSet<Integer>> numberMap; // Maps number -> TreeSet of indices

    public LC_2349() {
        indexMap = new HashMap<>();
        numberMap = new HashMap<>();
    }

    public void change(int index, int number) {
        if (indexMap.containsKey(index)) {
            int oldNumber = indexMap.get(index);
            if (oldNumber != number) {
                numberMap.get(oldNumber).remove(index);
                if (numberMap.get(oldNumber).isEmpty()) {
                    numberMap.remove(oldNumber);
                }
            }
        }
        indexMap.put(index, number);
        numberMap.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        return numberMap.containsKey(number) && !numberMap.get(number).isEmpty()
                ? numberMap.get(number).first()
                : -1;
    }
}
