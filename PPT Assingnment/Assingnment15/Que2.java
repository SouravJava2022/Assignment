
/*Given an array a of integers of length n, find the nearest smaller number for every element such 
that the smaller element is on left side.If no small element present on the left print -1.*/

/*Input: n = 6
a = {1, 5, 0, 3, 4, 5}
Output: -1 1 -1 0 3 4
Explaination: Upto 3 it is easy to see
the smaller numbers. But for 4 the smaller
numbers are 1, 0 and 3. But among them 3
is closest. Similary for 5 it is 4.*/

package AssignmentQuestion15;

import java.util.Stack;

public class Que2 {

	static void prevSmaller(int[] s, int n)
    {
		Stack<Integer> st = new Stack<>();
		st.push(-1);
        for (int i = 1; i < n; i++) {
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (s[i]>s[j]) {
                	st.push(s[j]);
                    break;
                }
            }
            if (j == -1)
            	st.push(-1);
        }
        Object[] vals = st.toArray();
		for (Object obj : vals) {
			System.out.println(obj);
		}
    }
    public static void main(String[] args)
    {
        int[] s = { 1, 5, 0, 3, 4, 5};
        int n = s.length;
        prevSmaller(s, n);
    }

}