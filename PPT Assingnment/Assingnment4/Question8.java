package Assingnment4;
/*
 * <aside>
💡 **Question 8**

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

*Return the array in the form* [x1,y1,x2,y2,...,xn,yn].

</aside>
 */
import java.util.ArrayList;
import java.util.List;

public class Question8 {
    public static void main(String[] args) {
        int [] a={2,5,1,3,4,7};
        int n=3;

        List list =new ArrayList<>();
        int [] rs=  interchange(a, n);
        for (int i : rs) {
           list.add(i);
        }
        System.out.println(list);
    }
        public static int[] interchange(int[] nums, int n) {
            int[] result = new int[2 * n];
        
            for (int i = 0; i < n; ++i) {
                result[2 * i] = nums[i];
                result[2 * i + 1] = nums[n + i];
            }
            return result;
        }
    }

