package Assingnment9;
/*
 *<aside>
💡 **Question 6**

Given first term (a), common difference (d) and a integer N of the Arithmetic Progression series, the task is to find Nth term of the series.

</aside>
 */
public class Question6 {
    public static void main(String[] args) {
        int a=5;
        int d=2;
        int N=10;
        System.out.println(findNumber(a, d, N));
    }

    public static int findNumber(int a,int d,int n){
    
       return a+(n-1)*d;
    }
}
