package Assingnment10;

public class Question1 {
    
    public static void main(String[] args) {
        int n=27;
     System.out.println(isPowerOfThree(n));
    }
        public static boolean isPowerOfThree(int n) {
            if(n==0) return false;
            if(n==1) return true;
            if(n%3==0) return isPowerOfThree(n/3);
            else return false;
        }
}
