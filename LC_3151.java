public class LC_3151 {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if ((nums[i] % 2) == (nums[i + 1] % 2)) // Both even or both odd
                return false;
        }
        return true;
    }
}
