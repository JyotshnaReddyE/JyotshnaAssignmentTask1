package AS1T4;

public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 6, 7, 7, 9, 9};
        int len = arr.length;
        int temp[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[len - 1];
        for (int k = 0; k < j; k++) {
            System.out.print(temp[k]);
        }

    }
}



