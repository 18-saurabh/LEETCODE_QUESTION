public class LC_167 {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }

    public int[] twoSumBruteForce(int[] numbers, int target) {
        // Brute force approach
        int[] index = new int[2];
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    index[0] = i + 1;
                    index[1] = j + 1;
                    return index;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        LC_167 solution = new LC_167();
        int[] numbers = { 2, 7, 11, 15 };
        int [] numbers2 = { 1, 2, 3, 4, 5 };
        int target = 9;
        int target2 = 5;
        int[] result = solution.twoSum(numbers, target);
        int[] bruteForceResult = solution.twoSumBruteForce(numbers2, target2);
        System.out.println("Two Sum Result: " + result[0] + ", " + result[1]);
        System.out.println("Brute Force Result: " + bruteForceResult[0] + ", " + bruteForceResult[1]);
        // Output should be: Two Sum Result: 1, 2
        // Output should be: Brute Force Result: 1, 4
        // Note: The output indices are 1-based as per the problem statement.
    }
}
