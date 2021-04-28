package AS1T3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter year: ");
        Scanner in = new Scanner(System.in);
         int y = in.nextInt();
         if(((y%4==0) && (y%100!=0)) || (y%400==0))
         {
             System.out.println("Entered year is a leap year");
         }
         else
         {
             System.out.println("Entered year is not a leap year");
         }

    }
}
