package Assingnment9;
/*
 * Given a positive integer, N. Find the factorial of N. 
 */
public class Question3 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        
          if(n==1){
            return 1;
          }
          else if(n<0){
            return 0;
          }
        return n*factorial(n-1);
    }
}
