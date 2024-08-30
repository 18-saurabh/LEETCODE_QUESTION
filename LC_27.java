public class LC_27 {
    public int removeElement(int[] nums, int val) {
        int j = 0; // Pointer for the next position to place non-val elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j; 
    }
}

