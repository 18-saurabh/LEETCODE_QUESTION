class LC_268 {
    public int brute_missingNumber(int[] nums) {
        int sum_1 = 0;
        int sum_2 = 0;
        for (int i = 0; i < nums.length + 1; i++) {
            sum_1 += i;
        }
        for (int i = 0; i < nums.length; i++) {
            sum_2 += nums[i];
        }
        int difference = sum_1 - sum_2;
        return difference;
    }

    public int optimal_missingNumber(int[] nums) {
        int n = nums.length;
        int sum_1 = n * (n + 1) / 2;
        int sum_2 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum_2 += nums[i];
        }
        int difference = sum_1 - sum_2;
        return difference;
    }

    public int most_optimal_missingNumber(int[] nums) {

        int N = nums.length;
        int xor_1 = 0, xor_2 = 0;
        for (int i = 0; i < N; i++) {
            xor_2 = xor_2 ^ nums[i];
            xor_1 = xor_1 ^ (i);
        }
        xor_1 = xor_1 ^ N;
        return xor_1 ^ xor_2;
    }

}
