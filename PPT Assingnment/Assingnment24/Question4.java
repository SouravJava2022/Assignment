package in.deb;

import java.util.Arrays;
import java.util.Comparator;

public class Question4 {
	static class Word {
        String str; 
        int index; 
        
        Word(String str, int index)
        {
            this.str = str;
            this.index = index;
        }
    }
 
      static class DupArray {
        Word[] array; 
        int size; 
 
     
        public DupArray(String str[], int size)
        {
            this.size = size;
            array = new Word[size];
 
            // One by one copy words from the
            // given wordArray to dupArray
            int i;
            for (i = 0; i < size; ++i) {
                
                array[i] = new Word(str[i], i);
            }
        }
    }
 
    static class compStr implements Comparator<Word> {
        public int compare(Word a, Word b)
        {
            return a.str.compareTo(b.str);
        }
    }
 

    static void printAnagramsTogether(String wordArr[],
                                      int size)
    {
        DupArray dupArray = new DupArray(wordArr, size);
 
        int i;
        for (i = 0; i < size; ++i) {
            char[] char_arr
                = dupArray.array[i].str.toCharArray();
            Arrays.sort(char_arr);
            dupArray.array[i].str = new String(char_arr);
        }
 
        
        Arrays.sort(dupArray.array, new compStr());
 
        for (i = 0; i < size; ++i)
            System.out.print(
                wordArr[dupArray.array[i].index] + " ");
    }
 
    // Driver program to test above functions
    public static void main(String args[])
    {
        String wordArr[]
            = { "eat","tea","tan","ate","nat","bat" };
        int size = wordArr.length;
        printAnagramsTogether(wordArr, size);
    }
}

