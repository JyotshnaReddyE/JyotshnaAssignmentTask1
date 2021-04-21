package AS1T2;

import java.util.Scanner;
public class PrintStrings {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("Input a number: ");
        int a = val.nextInt();
        if(((a%3)==0 && (a%5)==0)){
            System.out.println("Consultadd JAVA Training");
        } else if ((a % 5) == 0) {
            System.out.println("JAVA Training");
        } else if ((a % 3) == 0) {
            System.out.println("Consultadd");
        }
        else{
            System.out.println("No string");
        }
    }
}
