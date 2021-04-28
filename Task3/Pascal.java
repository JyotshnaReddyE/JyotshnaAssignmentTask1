package AS1T3;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args){
        int row,c=1,b,i,j;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        row = in.nextInt();
        for(i=0;i< row;i++)
        {
            for(b=1;b<=row-i;b++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }
    }
}
