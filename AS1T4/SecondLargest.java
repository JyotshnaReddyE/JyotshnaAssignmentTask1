package AS1T4;

public class SecondLargest {
    public static void main(String args[]){
        int temp, size;
        int array[] = {20, 30, 35, 73, 86, 47};
        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second largest number is: "+array[size-2]);
    }
}
