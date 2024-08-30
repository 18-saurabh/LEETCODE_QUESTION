import java.util.*;
public class LC_1480 {
    public static void q_1480(int []nums) {
        int result[]=new int[nums.length];
        result[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            result[i]=nums[i]+result[i-1];
        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(result[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sze of arrays");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements in the arrays");
        for (int i=0;i<nums.length;i++) {
            nums[i] = sc.nextInt();
            System.out.println("");
        }
        for (int elements : nums) {
            System.out.print(elements + " ");
        }
    q_1480(nums);
    }
}


