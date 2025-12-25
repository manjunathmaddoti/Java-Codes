package Com.java.code.Decision_Making_Statements.If;

import java.util.Scanner;

public class PositiveCheck {

        public static void main(String[] args){

            Scanner sc =new Scanner(System.in);
            System.out.print("Enter a value : ");
            int num = sc.nextInt();
            if(num > 0){
                System.out.println("This number is positive :" +num);
            }
        }
}
