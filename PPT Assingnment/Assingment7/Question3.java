 /*
  * <aside>
💡 **Question 3**

Given two non-negative integers, num1 and num2 represented as string, return *the sum of* num1 *and* num2 *as a string*.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly

</aside>
  */
 package Assingment7;

public class Question3 {
 public static void main(String[] args) {
    String num1="11";
    String num2="123";

   String s= Solution(num1,num2);
   System.out.println(s);

 }

public static String Solution(String num1, String num2) {

    String res="";
    int i=num1.length()-1;
    int j=num2.length()-1;

    int carry=0;

    while (i>=0 || j>=0 || carry!=0) {
        int ival=i>=0 ? num1.charAt(i)-'0':0;
        int jval=j>=0 ?num2.charAt(j)-'0':0;

        i--;
        j--;

        int sum=ival +jval+carry;
        res=(sum%10)+res;
        carry=sum/10;
    }
    return res;

}
}