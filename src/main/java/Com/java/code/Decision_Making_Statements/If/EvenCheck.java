package Com.java.code.Decision_Making_Statements.If;

import java.util.Scanner;
public class EvenCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value :");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+ " is Even number");
        }
    }
}
