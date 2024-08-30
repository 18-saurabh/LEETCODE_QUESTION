import java.util.*;
public  class LC_1281 {
    public static void subtractProductandSum(int n){
        int result = 0;
        int productofDigit = 1;
        int sumofDigit = 0;
        // code here
        int reverse = 0;
        while (n != 0) {
            int L_Digit = n % 10;
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                System.out.println("Wrong Input");
            }
            reverse = L_Digit;
            n = n / 10;
            System.out.println(reverse);
            productofDigit *= reverse;
            sumofDigit += reverse;
        }
        result = productofDigit - sumofDigit;
        System.out.println(result);
    }
    public static int Countdigits(int num){
        int count = 0;
        int originalNum = num;

        while (num > 0) {
            int digit = num % 10;
            if (originalNum % digit == 0) {
                count++;
            }
            num /= 10;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        // subtractProductandSum(n);
        subtractProductandSum(n);
    }

}

