package Com.java.code.Loops.For_Loop;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the numbers :");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("sum is "+sum);

    }
}




/*
Output:

Enter the numbers :
5
sum is 15
 */
