package AS1T7;

public class Intersection {
    public static void main(String args[]) {
        int arr1[] = {3,5,7,9,6};
        int arr2[] = {11,3,5,7,2};
        System.out.println("Intersection of two arrays:");
        for(int i=0; i<arr1.length;i++){
            for(int j=0; j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
