public class LC_154 {
    public int findMin(int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Update ans for the current mid
            ans = Math.min(ans, nums[mid]);

            // If the search space is sorted, the minimum is nums[low]
            if (nums[low] < nums[high]) {
                ans = Math.min(ans, nums[low]);
                break;
            }

            // Handle duplicates: shrink the search space
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
                continue; // Skip further checks and shrink the range
            }

            // If left part is sorted
            if (nums[low] <= nums[mid]) {
                low = mid + 1;
            }
            // If right part is sorted
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
