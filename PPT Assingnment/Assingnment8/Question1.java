package Assingnment8;
/*
 * <aside>
💡 **Question 1**

Given two strings s1 and s2, return *the lowest **ASCII** sum of deleted characters to make two strings equal*.

</aside>
 */
public class Question1 {
    public static void main(String[] args) {
        String s1="sea";
        String s2="eat"; 

        char [] c1=s1.toCharArray();
        char [] c2=s2.toCharArray();

        System.out.println(Solution(c1,c2) );
    }

    private static int Solution(char[] c1, char[] c2) {
         int sum=0;
         int sum1=0;
         int sum2=0;
        for(int i=0;i<c1.length;i++){
            sum1=sum1+c1[i];
            for(int j=0;j<c2.length;j++){
                if(c1[i]==c2[j]){
                    //System.out.println(i+"j"+j);

                    sum=sum+c1[i];
                }
            }
        }

       // System.out.println("Sum"+sum);
        for(int k=0;k<c2.length;k++){
            sum2=sum2+c2[k];
        }
        int sum3=sum1-sum;
        int sum4=sum2-sum;
       int sum5=sum3+sum4;

       //System.out.println(sum5);
     return sum5;
    }
    
}
