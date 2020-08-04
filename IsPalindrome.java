/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 * */
public class IsPalindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
    }

    public static boolean isPalindrome(String s) {
        String ss = "";
        boolean req = false;
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] nv = str.toCharArray();
        for(int i = nv.length-1; i >= 0; i-- ){  ss = ss+nv[i]; }
        if(str.equalsIgnoreCase(ss))
             req = true;
        return req;
    }

}
