package Assingment7;

import java.util.Stack;

public class Question7 {
    public static void main(String[] args) {
        String s= "ab#c";
        String t="ab#c";
    
       String b= Solution(s);
       System.out.println(b.equals(Solution(t)));
    }

    public static String Solution(String s) {
        Stack st= new Stack<>();

        for (char c : s.toCharArray()) {
            
            if(c!='#'){
                st.push(c);
            }
            else if (!st.empty()) {
                st.pop();
            }
        }
        return String.valueOf(st);
     }
       
    }

