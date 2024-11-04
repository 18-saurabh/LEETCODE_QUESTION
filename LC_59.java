public class LC_59 {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n]; // n x n ka matrix bana rahe hain
        int num = 1; // 1 se numbering start karenge
        int left = 0; // Left boundary set kar rahe hain
        int top = 0; // Top boundary set kar rahe hain
        int right = n - 1; // Right boundary set kar rahe hain
        int bottom = n - 1; // Bottom boundary set kar rahe hain

        // Jab tak left <= right aur top <= bottom hai, tab tak matrix ko fill karte
        // rahenge
        while (left <= right && top <= bottom) {
            // Left se right tak top row ko fill karenge
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++; // Top row mein left se right tak number dal rahe hain
            }
            top++; // Top boundary ko neeche kar diya (upar wali row fill ho chuki hai)

            // Top se bottom tak right column ko fill karenge
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++; // Right column mein top se bottom tak number dal rahe hain
            }
            right--; // Right boundary ko left taraf kar diya (rightmost column fill ho gaya)

            // Agar top <= bottom hai to right se left tak bottom row ko fill karenge
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++; // Bottom row mein right se left tak number dal rahe hain
                }
                bottom--; // Bottom boundary ko upar kar diya (bottom row fill ho gayi)
            }

            // Agar left <= right hai to bottom se top tak left column ko fill karenge
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++; // Left column mein bottom se top tak number dal rahe hain
                }
                left++; // Left boundary ko right taraf kar diya (leftmost column fill ho gaya)
            }
        }
        return matrix; // Final matrix return kar rahe hain
    }
}
