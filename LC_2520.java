import java.util.Scanner;
public class LC_2520 {
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
        int num=sc.nextInt();
        // subtractProductandSum(n);
        System.out.println(Countdigits(num));
        sc.close();
        
    }
}
