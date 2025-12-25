package Com.java.code.Decision_Making_Statements.If;

import java.util.Scanner;

 public class GradeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System .out.println("Enter your marks :");

        int marks = sc.nextInt();
        if(marks>=90){
            System .out.println("Excellent");
        }

        if(marks>=75){
            System .out.println("Good");
        }

        if(marks>=50){
            System .out.println("Just passed");
        }

        if(marks<=50){
            System .out.println("You want to improve");
        }
    }

}
