/*
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 */
package Assingment7;

public class Question4 {
    public static void main(String[] args) {
        String s="Let's take LeetCode contest";

       char [] c= s.toCharArray();
       int len=c.length;
       int startpoint=0;
       for (int endpoint = 0; endpoint <=len; endpoint++) {
        
        if(endpoint==len || c[endpoint]==' '){
            reverse(c,startpoint,endpoint-1);
            startpoint=endpoint+1;
        }
       }
       System.out.println(new String(c));
    }

    public static void reverse(char[] c, int i, int j) {
        while(i<j) {
        char temp=c[i];
          c[i]=c[j];
          c[j]=temp;

          i++;
          j--;
        }
    }
}
