package Com.java.code.Loops.For_Loop;


import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int sum =0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("perfect Number");
        }else{
            System.out.println("Not a Perfect Number");
        }
    }
}


/*
Output:
Enter a number :
6
perfect Number
 */