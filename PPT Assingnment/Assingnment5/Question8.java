package Assingnment5;

import java.util.Arrays;

public class Question8 {
    public static void main(String[] args) {
      int []  changed ={1,3,4,2,6,8};
      //Arrays.sort(changed);
      int [] a=new int[changed.length];
      for (int i = 0; i < changed.length; i++) {
          a[i]=(changed[i]*2);
        }
       // Arrays.sort(a);

       for (int i = 0; i < changed.length; i++) {
        for (int j = 0; j <a.length; j++) {
            if(changed[i]==a[j]){
               

                    System.out.println(a[i]+"hi"+a[j]);
                
            }
        }
       }
    }
}
