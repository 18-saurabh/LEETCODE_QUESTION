import java.util.Arrays;
import java.util.Scanner;

public class LC_2089 {
    public static int[] targetNumber(int nums[],int target){
        int tempIndices[]=new int[nums.length];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                tempIndices[i]=i;
            }
        }
        return tempIndices;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
    }

}
