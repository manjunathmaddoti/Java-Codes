package Com.java.code.Decision_Making_Statements.If;

import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");

        int age=sc.nextInt();
        if(age>=18){
            System.out.println(age+ " is Eligible for vote");
        }
    }
}



/*
Output:
Enter your age:
18
18 is Eligible for vote

 */