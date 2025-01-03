public class LC_1823 {
    public int findTheWinner(int n, int k) {
        int winner = 0; // Base case: J(1, k) = 0 (0-indexed)
        for (int i = 2; i <= n; i++) {
            winner = (winner + k) % i; // Apply the Josephus recurrence
        }
        return winner + 1; // Convert to 1-indexed
    }
}
