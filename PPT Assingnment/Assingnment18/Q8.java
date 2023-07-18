
package in.deb;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q8 {
	static boolean recreationalSpot(int[] arr, int n)
    {
        List<Integer> small = new ArrayList<>();
       
        int min1 = arr[0];
        for (int i = 0; i < n; i++) {
            if (min1 >= arr[i]) {
                min1 = arr[i];
 
                small.add(-1);
            }
            else {
                
                small.add(min1);
            }
        }
        // Initialize empty stack
        Stack<Integer> s = new Stack<>();
 
        // Looping from last index to first index don't
        // consider the possibility of 0th index because it
        // doesn't have left elements
        for (int i = n - 1; i > 0; i--) {
            // Pop's up until either stack is empty or top
            // element greater than small[i]
            while (!s.isEmpty()
                   && s.peek() <= small.get(i)) {
                s.pop();
            }
            // Checks the conditions that top element of
            // stack is less than arr[i] If true, then
            // return true;
            if (!s.isEmpty() && small.get(i) != -1
                && s.peek() < arr[i]) {
                return true;
            }
            s.push(arr[i]);
        }
        return false;
    }
 
    public static void main(String[] args)
    {
        int[] arr = { 4, 7, 11, 5, 13, 2 };
        int N = arr.length;
 
        // Function call
        if (recreationalSpot(arr, N)) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }
    }

}