import java.util.Scanner;

public class LC_2894{
     public static int differenceOfSums(int n, int m) {
        int num1=0;
        int num2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                num2 += i;
            }
            else if(i%m!=0){
                num1 +=i;
            }
        }
        return num1-num2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("entr m");
        int m=sc.nextInt();
        System.out.println(differenceOfSums(n, m));
    }
}