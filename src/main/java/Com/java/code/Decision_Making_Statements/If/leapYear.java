package Com.java.code.Decision_Making_Statements.If;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Year:");
        int year=sc.nextInt();
        if(year%4 == 0 && year% 100 != 0 || year%400 == 0){
            System.out.println(year+ " is a Leap year");
        }
    }
}

/*
Output:

Enter a Year:
2024
2024 is a Leap year
 */