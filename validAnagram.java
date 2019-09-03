class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
         t = t.toLowerCase();
     char[] word1 = s.toCharArray();
     char[] word2 = t.toCharArray();
     java.util.Arrays.sort(word1);
     java.util.Arrays.sort(word2);
     return java.util.Arrays.equals(word1,word2);
    }
}
