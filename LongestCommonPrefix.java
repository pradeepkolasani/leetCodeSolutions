/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] a = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(a));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (isValidArray(strs)) {
            if(strs.length == 1)
                return strs[0];
            String re = getSmallestString(strs);
            List<String> b = removeSmallString(strs, re);
            char[] ch = re.toCharArray();
            Boolean status = false;
            String a = "";
            for (int i = 0; i < ch.length; i++) {
                a = a + ch[i];
                for (int j = 0; j < b.size(); j++) {
                    if (!b.get(j).contains(a))
                        status = true;
                    else
                        status = false;
                }
                if (status)
                    break;
            }

            if(a.length() ==1 && re.length() ==1 && !status)
                return a;
            else
                return a.substring(0, a.length() - 1);
        } else
            return "";
    }

    private static Boolean isValidArray(String[] strs) {
        Boolean status = false;
        Matcher matcher;
        String dateRegex = "^[a-z]+$";
        Pattern pattern = Pattern.compile(dateRegex);
        for (int j = 0; j < strs.length; j++) {
            matcher = pattern.matcher(strs[j]);
            if (matcher.matches())
                status = true;
            else
                status = false;
            break;
        }
        System.out.println(status);
        return status;
    }

    private static List<String> removeSmallString(String[] strs, String a) {
        List<String> b = new ArrayList<>();
        for (int j = 0; j < strs.length; j++) {
            if (!a.equalsIgnoreCase(strs[j]))
                b.add(strs[j]);
        }
        return b;
    }

    private static String getSmallestString(String[] strs) {
        String a = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < a.length())
                a = strs[i];
        }

        return a;
    }

}

