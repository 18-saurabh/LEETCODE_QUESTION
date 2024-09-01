import java.util.Arrays;
public class LC_283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            // Print the array without using an explicit loop
            System.out.println("Array elements: " + Arrays.toString(nums));
            return; // Return early since no zeros need to be moved
        }
        
        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
