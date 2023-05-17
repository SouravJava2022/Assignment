//5. WAP to sort an array using Selection Sort Algorithm
public class SelectionSort {
    public static  void main(String[]args) {
        int []a={9,3,2,1,5};
        for(int i=0;i<a.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min]){
                min=j;
                }
            }
            if(min!=i)
            {
             int var=a[i];
                a[i]=a[min];
                a[min]=var;
            }
        }
        for(int elem:a)
        {
            System.out.println(elem);
        }
    }
}
