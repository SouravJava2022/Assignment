/*
 * Q3.** Given a sorted array of distinct integers and a target value,
 *  return the index if the target is found. If not, 
 * return the index where it would be if it were inserted in order.
    
    You must write an algorithm with O(log n) runtime complexity
 */
public class Question3 {
    public static void main(String[] args) {
        int [] nums={1,3,5,6};
        int target=5;
        Question3 q=new Question3();
          int k=q.Solution(nums, target);
          System.out.println("Target Index Value::"+k);
          /*
           * Time Complexity Is::O(N)
           */
    }

     int Solution(int[]numps,int target) {
      
        for(int i=0;i<numps.length;i++){
            if(numps[i]==target)
                return i;
            
            else if(numps[i]>target)
            return i;
        }
        return numps.length;
    }
}
