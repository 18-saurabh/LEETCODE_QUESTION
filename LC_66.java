public class LC_66 {
        public int[] plusOne(int[] digits) {
            int n = digits.length;

            // Traverse from the last digit to the first
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    // If the digit is not 9, just increment it and return the array
                    digits[i]++;
                    return digits;
                }
                // If the digit is 9, set it to 0 and continue to the next digit
                digits[i] = 0;
            }

            // If all digits were 9, we need to add a 1 at the start
            int[] result = new int[n + 1];
            result[0] = 1; // First digit is 1, rest are 0 by default
            return result;
        }
}

