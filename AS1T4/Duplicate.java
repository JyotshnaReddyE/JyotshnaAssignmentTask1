package AS1T4;

public class Duplicate {
    public static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];

        }
        return j;
    }
        public static void main (String[]args){
            int arr[] = {5, 4, 6, 6, 7, 7, 9, 9};
            int len = arr.length;
            len = removeDuplicates(arr, len);
            for (int i = 0; i < len; i++)
                System.out.print(arr[i] + " ");
        }
    }



