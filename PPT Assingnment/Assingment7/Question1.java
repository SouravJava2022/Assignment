package Assingment7;

import java.util.HashMap;

/**
 * <aside>
💡 **Question 1**

Given two strings s and t, *determine if they are isomorphic*.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

</aside>
 */

   class Question1 {

    public static void main(String[] args) {
        String s="egg";
        String t="add";

       boolean b= Solution(s,t);

       System.out.println(b);
    }

    public static boolean Solution(String s, String t) {
       HashMap <Character,Character> hm= new HashMap<Character,Character>();
        if(s.length()!=t.length()) return false;
          for (int i = 0; i < s.length(); i++) {

              char p1=s.charAt(i);
              char p2=t.charAt(i);
             if(hm.containsKey(p1))
             {
                 if(hm.get(p1)!=p2){
                    return false;
                }
            }
            else if(hm.containsValue(p2)){
                        return false;
                    }
            else{
                    hm.put(p1,p2);
                }
          }
        return true;

    }
}