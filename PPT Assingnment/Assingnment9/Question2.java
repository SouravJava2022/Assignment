package Assingnment9;
/*
 * Given a number n, find the sum of the first natural numbers.
 */
public class Question2 {
    public static void main(String[] args) {
        int n=3;
        System.out.println(sum(n));
    }

    public static int sum(int n){
        
          if(n==0){
            return 0;
          }
          else if(n<0){
            return 0;
          }
        return n+sum(n-1);
    }
}
