package Assingnment2;

public class Question3 {
    public static void main(String[] args) {
        int [] a={1,3,2,2,5,2,3,7};
        int n=a.length;
        Solution(a, n);
    }
    public static void Solution(int [] a,int n){
        int res=0;
        for(int i=0;i<n;i++){
            int count=0;
         boolean flag=false;
            for(int j=0;j<n;j++){
                if(a[i]==a[j]){
                    count++;
                 }
                 else if(a[j]+1==a[i])
                 {
                       count++;
                     flag=true;
                 }
             }
             if(flag){
               res=Math.max(res, count);
             }
         }
         System.out.println(res);
 }
}
