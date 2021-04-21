package AS1T2;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = val.nextInt();
        if(i%2 != 0) {
            System.out.println("NEW");
        }
        if((i%2 == 0) && (i>=2)&&(i<=5))
        {
            System.out.println("OLD");
        }
        else if((i%2 == 0) && (i>=6)&&(i<=30))
        {
            System.out.println("NEW");
        }
        else if((i%2 == 0) && (i>30))
        {
                System.out.println("OLD");
        }

    }
}

