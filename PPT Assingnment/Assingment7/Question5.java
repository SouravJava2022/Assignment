/*
 * <aside>
💡 **Question 5**

Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

</aside>
 */
package Assingment7;

public class Question5 {
    public static void main(String[] args) {
        
        String s="abcdefg";
        int k=2;
        char[] c=s.toCharArray();

        for(int start=0;start<c.length;start+=k*2){

            int i=start; int j=Math.min(start+k -1, c.length-1);

            while (i<j) {
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;

                i++;
                j--;
            }
        }
        System.out.println(new String(c));
    }
}
