/*
https://leetcode.com/problems/valid-anagram/description/
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        Array.sort(a);
        Array.sort(b);

        returnArray.equals(a,b);
    }
}



