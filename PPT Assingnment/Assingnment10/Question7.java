package Assingnment10;
/*
 * <aside>
💡 **Question 7**

Given a string **str**, the task is to print all the permutations of **str**. A **permutation** is an arrangement of all or part of a set of objects, with regard to the order of the arrangement. For instance, the words ‘bat’ and ‘tab’ represents two distinct permutation (or arrangements) of a similar three letter word.

</aside>
 */
public class Question7 {
    public static void main(String[] args) {
        String s="ABC";
        String ans="";

        System.out.println(s.substring(0, 2));
        Solution(s,ans);
    }

    private static void Solution(String s, String ans) {
     if(s.length()==0){
        System.out.println(ans+" ");
        return;
     }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            String left=s.substring(0, i);
            String right=s.substring(i+1);
           
            String rest=left+right;
        Solution(rest, ans+ch);
        }
        
    }
}
