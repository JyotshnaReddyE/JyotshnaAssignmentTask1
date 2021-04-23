package AS1T3;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int  n = val.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
