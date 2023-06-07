package Assingnment9;
/*
 * <aside>
💡 **Question 4**

Given a number N and a power P, the task is to find the exponent of this number raised to the given power, i.e. N^P

</aside>
 */
public class Question5 {
    public static void main(String[] args) {
        int N[]={1, 4, 3, -5, -4, 8, 6};
        int P=N.length;
        System.out.println(max(N,P));
    }

    public static int max(int[] n,int p){
       if(p==1) return n[0];

       return Math.max(n[p-1],max(n,p-1));
    }
}
