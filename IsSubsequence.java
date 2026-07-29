class Solution {
    public boolean isSubsequence(String s, String t) {
        int sPtr = 0, tPtr = 0;

        while(sPtr<s.length() && tPtr<t.length()){
            if(s.charAt(sPtr) == t.charAt(tPtr)){
                sPtr++;
            }
            tPtr++;
        }
        return sPtr==s.length();        // not s.length()-1 because when last letter matches, the sPtr gets incremented for last time and goes at s.length();
    }
}