package Assingnment4;
/*
 * Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*

- answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
- answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
       int [] nums1 = {1,2,3}, nums2 = {2,4,6};
        ;

        System.out.println(Solution.findDifference(nums1, nums2));
    }
}
class Solution {
    // Returns the elements in the first arg nums1 that don't exist in the second arg nums2.
        static List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        Set<Integer> onlyInNums1 = new HashSet<> (); 
        
        // Store nums2 elements in an unordered set. 
        Set<Integer> existsInNums2 = new HashSet<> (); 
        for (int num : nums2) {
            existsInNums2.add(num);
        }
        
        // Iterate over each element in the list nums1.
        for (int num : nums1) {
            if (!existsInNums2.contains(num)) {
                onlyInNums1.add(num);
            }
        }
        
        // Convert to vector.
        return new ArrayList<>(onlyInNums1);
    }
    
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1, nums2), getElementsOnlyInFirstList(nums2, nums1));
    }
}
