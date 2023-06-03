package Assingnment8;
/*
 * <aside>
💡 **Question 3**

Given two strings word1 and word2, return *the minimum number of **steps** required to make* word1 *and* word2 *the same*.

In one **step**, you can delete exactly one character in either string.

</aside>
 */
public class Question3 {
    public static void main(String[] args) {
       String s1="sea";
       String s2="eat";
       
      System.out.println(minDistance(s1, s2));// minDistance(s1, s2);
    }

    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int lcs = LCS(word1,word2,m,n);  
        return m+n-(2*lcs);
    }
    public static int LCS(String s1,String s2,int m,int n){
        if(n==0 || m==0) return 0;
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1+LCS(s1,s2,m-1,n-1);
        }
        else
            return Math.max(LCS(s1,s2,m-1,n),LCS(s1,s2,m,n-1));
    }
}
