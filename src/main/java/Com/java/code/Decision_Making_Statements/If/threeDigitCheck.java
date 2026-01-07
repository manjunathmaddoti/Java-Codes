package Com.java.code.Decision_Making_Statements.If;

import java.util.Scanner;
public class threeDigitCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits:");

        int num =sc.nextInt();
        if(num>=100 && num<=999){
            System.out.println(num+" is three digit number");
        }
    }
}


/*
Output:

Enter the digits:
100
100 is three digit number

 */