package AS1T2;

import java.util.Scanner;

public class Random {
    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char  c = val.next().charAt(0);
        if(c=='r' || c== 'R'||c=='a'||c== 'A' ||c== 'n' ||c== 'N' ||c== 'd' ||c== 'D' ||c== 'o' ||c== 'O' ||c== 'm' ||c=='M'){
            System.out.println("FOUND");
        }else{
            System.out.println(" NOT FOUND");
        }

    }
}
