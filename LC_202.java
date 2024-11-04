import java.util.Scanner;

public class LC_202 {
    public static boolean is_Happy(int n) {
        int l_digit = 0;
        int square;
        int sum = 0;
        int num;
        while (n > 0) {
            l_digit %= 10;
            num = l_digit;
            square = num * num;
            sum += square;
            n /= n;
        }
        if (sum == 1) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = getSumOfSquares(n);
        }
        return n == 1;
    }

    private static int getSumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // subtractProductandSum(n);
        System.out.println(isHappy(n));
        sc.close();

    }
}
