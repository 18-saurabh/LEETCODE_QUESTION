public class LC_461 {
    public int hammingDistance(int x, int y) {
        int ans = x ^ y;
        int cnt = 0;
        for (int i = 0; i <= 31; i++) {
            if ((ans & (1 << i)) != 0) { // Correct condition
                cnt++;
            }
        }
        return cnt;
    }
}
