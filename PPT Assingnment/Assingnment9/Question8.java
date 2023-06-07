package Assingnment9;

public class Question8 {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        int l=a.length-1;

        System.out.println(multi(a,l));
    }

    private static int multi(int[] a, int n) {
     if(n==0){
        return a[0];
     }
     
    return a[n]*multi(a,n-1);  
    }
}
