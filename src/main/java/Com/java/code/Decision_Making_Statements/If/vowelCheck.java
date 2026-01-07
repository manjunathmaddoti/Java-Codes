package Com.java.code.Decision_Making_Statements.If;

import java.util.Scanner;
public class vowelCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='i' || ch=='O' || ch=='U');
        System.out.println(ch+ " is vowel");
    }
}


/*
Output:

Enter the value:
A
A is vowel

 */