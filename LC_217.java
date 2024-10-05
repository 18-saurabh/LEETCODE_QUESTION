import java.util.Arrays;
import java.util.Scanner;

public class LC_217 {
     public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        System.out.print("Sorted array is: ");
        for (int i = 0; i <nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        for(int i=1;i<nums.length;i++){
            if (nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The size of array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter The elemnts in arrays");
        for(int i= 0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Elements in arrays are");
        for(int i=0; i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println(containsDuplicate(nums));
        sc.close();
    }
}
