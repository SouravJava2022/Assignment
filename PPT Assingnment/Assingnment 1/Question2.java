/*
 *  Given an integer array nums and an integer val, remove all occurrences of val in nums
 *  in-place. The order of the elements may be changed. Then return the number of elements
 *  in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, 
to get accepted, you need to do the following things:

- Change the array nums such that the first k elements of nums contain the elements
 which are not equal to val. The remaining elements of nums are not important as well as
  the size of nums.
- Return k.

 */

public class Question2 {
    public static void main(String[] args) {
        int [] numps={3,2,2,3};
        int val=3;
        Question2 q=new Question2();
       int a= q.removeElement(numps, val);
       System.out.println("Number That is not equal to val::"+a);

    }
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int aa[]=new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                aa[i] = nums[j];
                i++;
            }
        }
        for (int k : aa) {
            
            System.out.println(k);
        }
        return i;
    }
}
