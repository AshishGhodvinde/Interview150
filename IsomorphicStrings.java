class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())    return false;
        int[] sFreq = new int[256];
        int[] tFreq = new int[256];

        for(int i=0; i<s.length(); i++){
            // index is calculated using implicit conversion in java
            // eg. (int)a = 97, (int)b = 98
            if(sFreq[s.charAt(i)] != tFreq[t.charAt(i)]){
                return false;
            }
            // to avoid zero conflict
            sFreq[s.charAt(i)] = i+1;
            tFreq[t.charAt(i)] = i+1;
        }
        return true;
    }
}

//store corresponding characters to same index in their arrays, next time if the char is repeated just check if it have same index in both arrays

// here, we are not checking actual values on same index of both arrays.
// so we just check corresponding values only, and not at same index. 
// just their values be same