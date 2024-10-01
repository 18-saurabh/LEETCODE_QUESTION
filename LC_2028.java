import java.util.Scanner;

public class LC_2028 {

    public static int[] missingRolls(int[] rolls, int mean, int N) {
        int sum = 0;
        for (int i = 0; i < rolls.length; i++) {
            sum += rolls[i];
        }
        int sum_n = (mean + N) * mean;
        int rem = sum_n - sum;
        for (int i = 0; i < N; i++) {
            rolls[i] = rem / N;
        }
        return rolls;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter mean");
        int mean=sc.nextInt();
        System.out.println("Enter size of second array");
        int N=sc.nextInt();
        System.out.println("Enter the element in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements in array are");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int storage[];
        storage=missingRolls(arr, mean, N);
        System.out.println("Output is:");
        for(int element : storage){
            System.out.println(element+" ");
        }
    }

}