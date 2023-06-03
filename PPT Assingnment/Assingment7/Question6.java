package Assingment7;

public class Question6 {
    public static void main(String[] args) {
        String s= "abcde";
        String goal="bcdea";
    
       boolean b= Solution(s,goal);
       System.out.println(b);
    }

    public static boolean Solution(String s, String goal) {
       if(s.length()==goal.length() && (s+s).contains(goal))
         return true;
         
         return false;
     }
       
    }

