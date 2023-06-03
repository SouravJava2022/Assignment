package Assingnment8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * <aside>
💡 **Question 8**

Given two strings s and goal, return true *if you can swap two letters in* s *so the result is equal to* goal*, otherwise, return* false*.*

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

- For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
</aside>
 */
public class Question8 {
    public static void main(String[] args) {
       String s = "ab", goal = "ba";

       ;
       System.out.println(Solutioonn.buddyStrings(s, goal));
    }

    }
    class Solutioonn {
        public static boolean buddyStrings(String A, String B) {
            if(A.length()!=B.length()){
                return false;
            }
    
            if(A.equals(B)){
                HashSet<Character> unique_chars = new HashSet();
                for(char c : A.toCharArray()){
                    unique_chars.add(c);
                }
    
                if(unique_chars.size()<A.length()){
                    return true;
                }
                else{
                    return false;
                }
            }
            List<Integer> diff = new ArrayList();
            for(int i=0; i<A.length(); i++){
                if(A.charAt(i)!=B.charAt(i)){
                    diff.add(i);
                }
            }
            if(diff.size() == 2 && 
            A.charAt(diff.get(0)) == B.charAt(diff.get(1)) &&
             B.charAt(diff.get(0)) == A.charAt(diff.get(1))
             ){
                return true;
            }
            else{
                return false;
            }
        }
    }
