import java.util.*;
public class LC_1512 {
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of array");
        int n=sc.nextInt();
        int []nums=new int [n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(nums[i]+" ");
        }
        System.out.println("Number of good pairs are");
        System.out.println(numIdenticalPairs(nums));
    }
}
