package Assingnment9;
/*
 * <aside>
💡 **Question 4**

Given a number N and a power P, the task is to find the exponent of this number raised to the given power, i.e. N^P

</aside>
 */
public class Question4 {
    public static void main(String[] args) {
        int N=5;
        int P=2;
        System.out.println(tothepower(N,P));
    }

    public static int tothepower(int n,int p){
        
          if(p==0){
            return 1;
          }
          else if(p<0){
            return 1/tothepower(n,-p);
          }
        return n*tothepower(n,p-1);
    }
}
