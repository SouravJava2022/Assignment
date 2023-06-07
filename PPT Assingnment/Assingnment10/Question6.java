package Assingnment10;
/*
 * System.out.println("Move disk " + disks + " from " + source + " —> " +
                                target);
 */
public class Question6 {
    public static void main(String[] args) {
        int n=3;
        Solution(n,1,2,3);
    }

    private static void Solution(int n, int source, int auxili, int target) {
       if(n==0){return;}
       
        Solution(n-1, source, target, auxili);

        System.out.println("Move disk " + n + " from " + source + " —> " +
                                target);
        
       Solution(n-1, auxili, source, target);
    }
}
