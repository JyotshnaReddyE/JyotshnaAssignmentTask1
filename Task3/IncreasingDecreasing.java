package AS1T3;

import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = in.nextInt();
        System.out.println("Enter second number");
        int b = in.nextInt();
        System.out.println("Enter third number");
        int c = in.nextInt();
        if(a<b && a<c && b<c){
            System.out.println("Increasing order");
        }
        else if(a>b && a>c && b>c){
            System.out.println("Decreasing order");
        }
        else{
            System.out.println("Neither Increasing nor Decreasing order");
        }
    }
}
