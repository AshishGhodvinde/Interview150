class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Populate magzineArr and then iterate thru ransomNote, then remove that char from magzineArr. if that becomes 0, return false
        int[] magFreq = new int[26];
        for(char ch : magazine.toCharArray()){
            magFreq[ch-'a']++;
        }
        for(char ch : ransomNote.toCharArray()){
            if(magFreq[ch-'a']==0)  return false;
            magFreq[ch-'a']--;
        }
        return true;


        // HashMap Soln
        // ransomLetters > magzineLetters, we have to check if ransomNote can be reconstructed
        // so if magzine chars gets zero, we have no scope to construct ransomeNote
        // Map<Character, Integer> map = new HashMap<>();
        // for(char ch : magazine.toCharArray()){
        //     map.put(ch, map.getOrDefault(ch, 0)+1);
        // }
        // for(char ch : ransomNote.toCharArray()){
        //     if(!map.containsKey(ch) || map.get(ch)<=0){    // check if key is present, as when it gets zero it gets removed
        //         return false;
        //     }
        //     map.put(ch, map.get(ch)-1);
        // }
        // return true;
    }
}