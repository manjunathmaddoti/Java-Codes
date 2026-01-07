package Com.java.code.Decision_Making_Statements.If;

import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int num=sc.nextInt();
        if(num%5==0){
            System.out.println(num+ " is divisible by 5");
        }
    }
}


/*
Output:

Enter the value:
55
55 is divisible by 5

 */