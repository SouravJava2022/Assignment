package Assingnment10;
/*
 * Given a string, count total number of consonants in it. A consonant is an English alphabet character that is not vowel (a, e, i, o and u). Examples of constants are b, c, d, f, and g.
 */
public class Question8 {
    public static void main(String[] args) {
        String s="geeksforgeeks portal";
        String s1=s.toLowerCase();
        int count=0;

        for (int i = 0; i <s.length(); i++) {
            if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||
            (s.charAt(i)=='o')||(s.charAt(i)=='u')){
                continue;
            }
            else if (s.charAt(i)==' ') {
                continue;
            }
            else{
                count++;
            }
        }

        System.out.println(count);
    }
}
