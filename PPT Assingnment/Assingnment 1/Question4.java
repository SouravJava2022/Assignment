/*
 * **Q4.** You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
    The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

      Increment the large integer by one and return the resulting array of digits.

 */

public class Question4 {
    public static void main(String[] args) {
        Question4 q=new Question4();
        int []nums={1,2,3};
         int b[]=q.Solution(nums);
         for (int i : b) {
            System.out.println(i);
         }
    }
    int [] Solution(int[]nums){
        int []a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
             a[i]=nums[i];
             if(i==nums.length-1){
                 a[i]=nums[i]+1;
             }
        }
        return a;
    }
}
