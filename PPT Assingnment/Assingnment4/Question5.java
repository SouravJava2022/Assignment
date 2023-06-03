package Assingnment4;
/*
 * <aside>
💡 You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

Given the integer n, return *the number of **complete rows** of the staircase you will build*.

</aside>
 */
public class Question5 {
    public static void main(String[] args) {
        int n=5;

        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
      }
}
