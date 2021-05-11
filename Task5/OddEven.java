package AS1T5;

public class OddEven {
    public static void main(String args[]){
        int a[]= {23,25,75,87,47,1,91,51,2};
        int b[]= {22,44,64,76,98,12,43,54,90};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        for(int i=0;i<b.length;i++){
            if(b[i]%2!=0){
                System.out.println(b[i]);
            }
        }
    }
}
