package AS1T1;

import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
       //printing integer, floating, double, characters and boolean values from the user
        Scanner val = new Scanner(System.in); // created object(val) of scanner
        System.out.println("Enter an integer value");
        int a = val.nextInt();
        System.out.println("you have entered a integer\n" +a);
        System.out.println("Enter a float value");
        float f = val.nextFloat();
        System.out.println("you have entered a float\n" +f);
        System.out.println("Enter a double value");
        double d = val.nextDouble();
        System.out.println("you have entered a double value\n" +d);
        System.out.println("Enter a string");
        String s = val.next();
        System.out.println("you have entered a string\n" +s);
        System.out.println("Enter a boolean value");
        Boolean b = val.nextBoolean();
        System.out.println("you entered a boolean value\n" +b);
    }
}
