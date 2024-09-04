import java.util.HashMap;
import java.util.Map;

public class LC_1 {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the value and its index
        Map<Integer, Integer> sumMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i]; // Current number
            int rem = target - a; // The number needed to reach the target
            
            // Check if the remainder is already in the map
            if (sumMap.containsKey(rem)) {
                // If found, return the indices of the two numbers
                return new int[] {sumMap.get(rem), i};
            }
            
            // If not found, add the current number and its index to the map
            if (!sumMap.containsKey(a)) {
                sumMap.put(a, i);
            }
        }
        
        // Return {-1, -1} if no solution is found
        return new int[] {-1, -1};
    }
}