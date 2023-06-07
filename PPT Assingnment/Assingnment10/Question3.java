package Assingnment10;
/*
 * <aside>
💡 **Question 3**

****Given a set represented as a string, write a recursive code to print all subsets of it. The subsets can be printed in any order.

</aside>
 */
public class Question3 {
    public static void main(String[] args) {
        String s="abc";
        String curr="";
        int index=0;
        Solution(s,curr,index);
    }

    private static void Solution(String s,String curr, int index) {
        int n=s.length();
        ;
        if(index==n) {
            System.out.println(curr);
         return;
        }

        Solution(s, curr, index+1);
        Solution(s, curr+s.charAt(index), index+1);
    }
}
