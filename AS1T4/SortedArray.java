package AS1T4;

public class SortedArray {
    public static void main(String[] args) {
        int arr[] = {5, 4, 6, 6, 7, 7, 9, 9};
        int len = arr.length;
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[j]=0;
                }

            }
        }
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i]!=0) {
                temp[j++] = arr[i];
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]);
        }
    }
}
