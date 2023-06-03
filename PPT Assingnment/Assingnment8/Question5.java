package Assingnment8;
/*
 * <aside>
💡 **Question 5**

Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of **consecutive repeating characters** in chars:

- If the group's length is 1, append the character to s.
- Otherwise, append the character followed by the group's length.

The compressed string s **should not be returned separately**, but instead, be stored **in the input character array chars**. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done **modifying the input array,** return *the new length of the array*.

You must write an algorithm that uses only constant extra space.

</aside>
 */
public class Question5 {
    public static void main(String[] args) {
        
        char [] c={'a','a','b','b','c','c','c'};
           
        
       
        System.out.println(Sollution.compress(c));
    }
}
class Sollution {
    public static int compress(char[] chars) {
        String s="";
        int c=1;
        int i;
        for (i=0;i<chars.length-1;i++)
        {
            if(chars[i]==chars[i+1]){
                  c++;
            }else{
                if(c>1)s+=chars[i]+""+c;
                else s+=chars[i];
                c=1;
            }
        }
        if(c>1)s+=chars[i]+""+c;
        else s+=chars[i];
        int k=0;
        for(char c1:s.toCharArray())
        {
            chars[k++]=c1;
        }
        System.out.println(s);
        return s.length();
       

    }
}