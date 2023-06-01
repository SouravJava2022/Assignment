package Assingnment2;
/*
 * Question 4 
 * You have a long flowerbed in which some of the plots are planted, and some are not. 
 * However, flowers cannot be planted in adjacent plots.
 * Given an integer array flowerbed containing 0's and 1's, 
 * where 0 means empty and 1 means not empty, and an integer n, 
 * return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 */
public class Question4{
    public static void main(String[] args) {
        int [] a={1,0,0,0,1};
        int n=a.length;
        int m=1;
       boolean b= Solution(a, n, m);
       
       
       System.out.println(b);
    }
    public static boolean Solution(int [] a,int n,int m){
        int res=0;
        for(int i=0;i<n;i++){
           
            if(a[i]==0){
                boolean left= (i==0 || a[i-1]==0);
                boolean right= (i==n-1 || a[i+1]==0);

                if(left && right){
                    a[i]=1;
                    res++;
                }
            }
         }
         System.out.println(res);
         return res >=m;
 }
}
