package Assingnment8;
/*
 * Given a string s containing only three types of characters: '(', ')' and '*', return true *if* s *is **valid***.

The following rules define a **valid** string:

- Any left parenthesis '(' must have a corresponding right parenthesis ')'.
- Any right parenthesis ')' must have a corresponding left parenthesis '('.
- Left parenthesis '(' must go before the corresponding right parenthesis ')'.
- '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
 */
public class Question2 {
    public static void main(String[] args) {
        String s="()";

        boolean b=Solution.checkValidString(s);
        System.out.println(b);
    }
}
class Solution {
    public static boolean checkValidString(String s) {
        
        // checking from left to right..
        int leftBalance = 0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='*'){
                leftBalance++;
            }
            else{
                leftBalance--;
            }
            
            if(leftBalance<0){
                return false;
            }
        }
        if(leftBalance == 0) return true;
        
        // checking from right to left..
        int rightBalance = 0;
        for(int i=s.length()-1 ; i>=0 ; i--){
            if(s.charAt(i)==')' || s.charAt(i)=='*'){
                rightBalance++;
            }
            else{
                rightBalance--;
            }
            
            if(rightBalance<0){
                return false;
            }
        }
        return true;
         
    }
}
