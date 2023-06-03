package Assingnment4;
/*
 * <aside>
💡 **Question 3**
Given a 2D integer array matrix, return *the **transpose** of* matrix.

The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

</aside>
 */
public class Question3 {
    public static void main(String[] args) {
       int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
         
       int[][]c=transpose(matrix);
       for(int i=0;i<c.length;i++){
        for(int j=0;j<c[i].length;j++){
            System.out.print(c[j]);

        }
           
       }
    }


     static int[][] transpose(int[][] A) {
        int R = A.length, C = A[0].length;
        int[][] ans = new int[C][R];
        for (int r = 0; r < R; ++r)
            for (int c = 0; c < C; ++c) {
                ans[c][r] = A[r][c];
            }
        return ans;
    }
}
