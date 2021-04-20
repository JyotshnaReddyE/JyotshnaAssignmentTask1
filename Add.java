package AS1T1;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Input the first number between 1-10 : ");
        int x = val.nextInt();
        System.out.println("Input the second number between 1-10: ");
        int y = val.nextInt();
        //Now apply condition so that the user can enter the values between 1-10
        if(((x>=1)&&(x<=10))&&((y>=1)&&(y<=10)))
        {
            int z=x+y;
            System.out.println("The value of z after adding x and y is:" +z);
            int a=  z+30;
            System.out.println("The value of a after adding 30:" +a);
        }
        else{
            System.out.println("You have entered the values which are not in the range");
        }
    }
}
