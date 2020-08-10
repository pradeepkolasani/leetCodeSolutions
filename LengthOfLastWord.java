/*Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5*/

public class LengthOfLastWord {
    public static void main(String[] args) {
        int[] a = {3,2,1,0,1};
        System.out.println(lengthOfLastWord(" "));
    }

    public static  int lengthOfLastWord(String s) {
        int a = 0;
        if(s.length() == 0)
            a= 0;
        else if(s.length() > 0){
            String[] ss = s.split(" ");
            if(ss.length > 0)
                a = ss[ss.length-1].length();
            else
                a = 0;
//            System.out.println("ss[ss.length] = " + ss[ss.length-1]);
        }
        return a;
    }


}
