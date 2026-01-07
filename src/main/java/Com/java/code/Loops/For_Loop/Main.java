package Com.java.code.Loops.For_Loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}




/*
Output :
Enter a number :
10
1
2
3
4
5
6
7
8
9
10

 */