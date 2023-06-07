package Assingnment10;
/*
 * <aside>
💡 **Question 4**

Given a string calculate length of the string using recursion.

</aside>
 */
public class Question4 {
    public static void main(String[] args) {
        String s="geeksforgeeks";
       int index=0;
       int n=s.length()-1;
       int count=1;
       System.out.println(Solution(s,index,n,count)); ;
    }

    private static int  Solution(String s, int index, int n, int count) {
        
        if(index==n){
           // System.out.println(count);
            return count;
        }
       return count+ Solution(s, index+1,n,count);
    }
}
