public class LC_1886 {
    public boolean findRotation(int[][] mat, int[][] target) {
        // Hum matrix ko 4 baar rotate kar sakte hain (0, 90, 180, aur 270 degrees)
        // aur dekhte hain kya yeh target ke sath match karta hai.
        for (int r = 0; r < 4; r++) {
            if (isEqual(mat, target)) {
                return true; // Agar match ho gaya, toh true return karo
            }
            rotate(mat); // Matrix ko 90 degrees se ghoomao
        }
        return false; // Agar 4 rotations ke baad match nahi mila toh false return karo
    }

    // Function jo matrix ko 90 degrees se ghoomata hai
    private void rotate(int[][] mat) {
        int n = mat.length;

        // Step 1: Matrix ko transpose karo
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp; // Transpose karne ka process
            }
        }

        // Step 2: Har row ko reverse karo taaki 90-degree rotation complete ho jaye
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][n - 1 - j];
                mat[i][n - 1 - j] = temp; // Row reverse karne ka process
            }
        }
    }

    // Function jo do matrices ko check karta hai ki kya woh barabar hain
    private boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false; // Agar koi element match nahi karta, toh false return karo
                }
            }
        }
        return true; // Agar sab elements match karte hain, toh true return karo
    }

}
