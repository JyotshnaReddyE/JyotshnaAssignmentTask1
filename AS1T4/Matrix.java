package AS1T4;

public class Matrix {
    public static void main(String args[]) {
        int a[][] = {{7, 3, 5}, {6, 5, 6}, {15, 5, 9}};
        int b[][] = {{5, 10, 20}, {7, 5, 6}, {1, 6, 5}};
        int c[][] = new int[3][3];
        System.out.println("Sum of the matrices:");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
