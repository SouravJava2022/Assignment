package Assingnment10;
/*
 * <aside>
💡 **Question 2**

You have a list `arr` of all integers in the range `[1, n]` sorted in a strictly increasing order. Apply the following algorithm on `arr`:

- Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.
- Repeat the previous step again, but this time from right to left, remove the rightmost number and every other number from the remaining numbers.
- Keep repeating the steps again, alternating left to right and right to left, until a single number remains.

Given the integer `n`, return *the last number that remains in* `arr`.

</aside>
 */
public class Question2 {
    public static void main(String[] args) {
        int n=9;
        System.out.println(Solution(n));
    }

    private static int Solution(int n) {
        if(n==1){
            return 1;
        }
        return 2*(1+n/2 -Solution(n/2));

    }
}
