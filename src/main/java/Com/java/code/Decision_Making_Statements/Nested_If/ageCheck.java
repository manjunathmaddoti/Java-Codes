package Com.java.code.Decision_Making_Statements.Nested_If;

import java.util.Scanner;

public class ageCheck {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your age :");
        int age = sc.nextInt();
        if(age>0){
            if(age<18){
                System.out.println(" You are minor");
            }
            else{
                System.out.println( " you are major");
            }

        }
        else {
            System.out.println("Invalid age");
        }
    }
}


/*
output :

Enter  your age :
25
 you are major

 */