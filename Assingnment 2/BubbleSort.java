//3. WAP to sort an array using Bubble Sort Algorithm.
public class BubbleSort {
    public static void main(String[]args){
        int []ar={12,10,25,20,1,5,30};
           for(int i=0;i<ar.length;i++)
           {
               for(int j=1;j<ar.length-i;j++)
               {
                 if(ar[j]<ar[j-1])
                   {
                       int tempVar=ar[j];
                           ar[j]=ar[j-1];
                           ar[j-1]=tempVar;
                    }
                }
            }
           for(int elem:ar)
            {
              System.out.println(elem);
            }
    }
}
