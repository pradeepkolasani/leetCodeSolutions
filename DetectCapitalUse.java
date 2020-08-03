/*
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 

Example 1:

Input: "USA"
Output: True
 

Example 2:

Input: "FlaG"
Output: False
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetectCapitalUse {
    public static void main(String[] args) {

        System.out.println(detectCapitalUse("FlaG"));
    }

    public static boolean detectCapitalUse(String word) {
        boolean req = false;
        char[] a = word.toCharArray();
        List<Character> nn = new ArrayList<Character>();
        List<Character> bb = new ArrayList<Character>();
        for(int i = 0; i < word.length(); i++) {
            int b = (int) a[i];
            if (b >= 65 && b <= 90) {
                nn.add(a[i]);
            } else if (b >= 97 && b <= 122) {
                bb.add(a[i]);
            }
        }
        if(nn.size()  == a.length || bb.size() == a.length)
            return req = true;
        if((nn.size() + bb.size() == a.length) && word.indexOf(nn.get(0)) == 0 && nn.size() == 1){
            return req = true;
        }

        return req;

    }

}

