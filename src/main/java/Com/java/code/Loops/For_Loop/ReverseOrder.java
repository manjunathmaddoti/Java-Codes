package Com.java.code.Loops.For_Loop;
import java.util.Scanner;
public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=n;i>=0;i--){
            System.out.println(i);
        }
    }
}


/*
output:

Enter the number
10

10
9
8
7
6
5
4
3
2
1
0

 */