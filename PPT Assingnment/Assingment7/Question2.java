package Assingment7;

import java.util.HashMap;

/**
 Given a string num which represents an integer, return true *if* num *is a **strobogrammatic number***.

A **strobogrammatic number** is a number that looks the same when rotated 180 degrees (looked at upside down).
 */

  public class Question2 {

    public static void main(String[] args) {
        String s="69";
     
       
       boolean b= Solution(s);

       System.out.println(b);
    }

    public static boolean Solution(String s) {
       HashMap  hm= new HashMap();
             hm.put('0', '0');
             hm.put('1', '1');
             hm.put('6','9');
             hm.put('9', '6');
             hm.put('8', '8');
             int i=0;
             int j=s.length()-1;
             if(s.length()==1){
             if (hm.containsKey(s.charAt(i))   ) {
                if(((char)hm.get(s.charAt(i))!=s.charAt(i)))
                           return true;
                 else if(((char)hm.get(s.charAt(i))==s.charAt(i))) {
                       return true;
                 }          
             }
             
             return false;
            }
             while(i<=j){
              char p1=s.charAt(i);
              char p2=s.charAt(j);
             if(!hm.containsKey(p1) || !hm.containsKey(p2))
             {
                    return false;
            }
            else if((char)hm.get(p1) !=p2){
                        return false;
                    }
               i++;
               j--;
            }
        return true;

    }
}