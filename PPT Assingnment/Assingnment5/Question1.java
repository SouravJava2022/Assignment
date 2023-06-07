package Assingnment5;
/*
 * <aside>
💡 **Question 1**

Convert 1D Array Into 2D Array

You are given a **0-indexed** 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using **all** the elements from original.

The elements from indices 0 to n - 1 (**inclusive**) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (**inclusive**) should form the second row of the constructed 2D array, and so on.

Return *an* m x n *2D array constructed according to the above procedure, or an empty 2D array if it is impossible*.

</aside>
 */
public class Question1 {
    public static void main(String[] args) {
        int [] a= {1,2,3,4};
        int m = 2;
        int n = 2;
       int [][]b= construct2DArray(a, m, n);
     for (int i = 0; i < b.length; i++) {
        for (int j = 0; j < b[i].length; j++) {
            
            System.out.println(b[i][j]+" ");
        }
     }
    }
    
    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                ans[i][j] = original[i * n + j];
            }
        }
        return ans;
    }
}

