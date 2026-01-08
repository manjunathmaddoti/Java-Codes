package Com.java.code.Loops.For_Loop;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number :");
        int num =sc.nextInt();

        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(num+" is a prime number");
        }
        else{
            System.out.println(num+ " is not a prime number");
        }
    }
}


/*
Output :

Enter a Number :
17

17 is a prime number
 */