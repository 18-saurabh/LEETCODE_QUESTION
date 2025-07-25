import java.util.Arrays;

public class LC_287 {
    // Brute Force solution
    // This approach runs in O(n^2) time and O(1) space.
    public int findDuplicate(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }

    // Optimal solution using Floyd's Tortoise and Hare (Cycle Detection)
    // This approach runs in O(n) time and O(1) space.
    public int optimal_findDuplicate(int[] nums) {

        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
