package Com.java.code.Loops.For_Loop;

import java.util.Scanner;

public class evenNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        for(int i=2; i<=n; i+=2){
            System.out.println(i);
        }
    }
}


/*
Output :

Enter a number :
100
2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100

 */