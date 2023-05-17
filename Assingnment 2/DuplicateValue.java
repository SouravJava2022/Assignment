//  1.WAP to find the duplicates present in an array
public class DuplicateValue {
    public static void main(String[]args){
        int []a={10,20,20,30,40,40,50};
          for(int i=0;i<a.length;i++)
          {
              for(int j=i+1;j<a.length;j++)
              {
                if(a[i]==a[j] && i!=j)
                {
                    System.out.println(" The Duplicate Value is "+a[j]+" "+ j);
                }
              }
          }
    }
}
