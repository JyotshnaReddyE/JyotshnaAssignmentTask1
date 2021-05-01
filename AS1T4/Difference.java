package AS1T4;
import java.util.Arrays;
public class Difference {
    public static void main(String[] args){
        {
            int[] arr = {5, 7, 2, 4, 9};
            System.out.println("Given Array: "+Arrays.toString(arr));
            int large = arr[0];
            int small = arr[0];
            for(int i = 1; i < arr.length; i++)
            {
                if(arr[i] > large)
                    large = arr[i];
                else if(arr[i] < small)
                    small = arr[i];
            }
            int diff=large-small;
            System.out.println("Difference between the largest and smallest values of the given array: " +diff);
        }
    }
}

