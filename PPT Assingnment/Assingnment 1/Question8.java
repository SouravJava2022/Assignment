/*
 * **Q8.** You have a set of integers s, which originally contains all the numbers
 *  from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated
 *  to another number in the set, which results in repetition of one number and loss of
 *  another number.

 *You are given an integer array nums representing the data status of this set after the error.

 *Find the number that occurs twice and the number that is missing and return them
 * in the form of an array.

 */
public class Question8 {
    public static void main(String[] args) {
        int s[]={1,2,2,4};
        int n=s.length;
       int num []= Solution(s,n);
       for (int i : num) {
        System.out.print("  "+i);
       }
    }

     static int[] Solution(int[] s, int n) {

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s[i]==s[j]){
                    System.out.println("Missing Element index::"+j+"  Index Value::"+s[j]);
                 return new int[]{s[i],s[j]+1};
                }
            }
        }
        return s;
    }
}
