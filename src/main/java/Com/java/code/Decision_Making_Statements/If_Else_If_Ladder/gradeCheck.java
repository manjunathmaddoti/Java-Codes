package Com.java.code.Decision_Making_Statements.If_Else_If_Ladder;

import java.util.Scanner;

import java.util.Scanner;

public class gradeCheck {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter  your marks: ");

        int marks =sc.nextInt();

        if(marks >= 90){
            System.out.println(" Grade A+");
        }

        else if(marks >= 75){
            System.out.println(" Grade B+");
        }


        else if(marks >= 60){
            System.out.println(" Grade c+");
        }

        else if (marks >= 45){
            System.out.println(" D");
        }
        else {
            System.out.println("fail");
        }

    }

}


/*
Output:

Enter  your marks:
76
 Grade B+

 */
