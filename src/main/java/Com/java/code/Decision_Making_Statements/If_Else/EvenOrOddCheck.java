package Com.java.code.Decision_Making_Statements.If_Else;

import java.util.Scanner;

public class EvenOrOddCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value :");
            int num =sc.nextInt();

            if(num %2 ==0){
                System.out.println(num+ " is Even number");
            }


            else{
                System.out.println(num+ " is odd number");
            }
        }
    }


