import java.util.Scanner;

public class LC_1814 
{
    public  static int countNicePairs(int[] nums) 
    {
        int temp_1[]=new int[nums.length];
        int temp_2[]=new int[nums.length];
        int count =0;
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = 0; j < nums.length; j++) 
            {
                temp_1[i] = nums[i] + reverse(nums[j]);
                temp_2[i]= nums[j] + reverse(nums[i]);
            }
            if(temp_1[i]==temp_2[i]){
                count++;
            }
        }
        System.out.println("Temp 1");
        for(int i=0;i<temp_1.length;i++){
            System.out.print(temp_1[i]+" ");
        }
        System.err.println();
        System.out.println("Temp 2");
        for (int i = 0; i < temp_2.length; i++) {
            System.out.print(temp_2[i] + " ");
        }
        System.out.println("Count is");
        return count;
    }
    public static int reverse(int n) {
        int last_digit;
        int reverse = 0;
        while (n > 0) {
            last_digit = n % 10;
            reverse = (reverse * 10) + last_digit;
            n = n / 10;
        }
        return reverse;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of array");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter The elemnts in arrays");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Elements in arrays are");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println(countNicePairs(nums));
        sc.close();
    }
}
