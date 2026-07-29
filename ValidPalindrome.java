class Solution {
    public boolean isPalindrome(String s) {
        // String removeSpaces = lowerCase.replaceAll("^a-z0-9", "");
        // [] → character class
        // ^ inside [] means not
        // So [^a-z0-9] means "anything that is not a lowercase letter or digit."
        
        String cleanS = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = 0, r = cleanS.length()-1;

        while(l<r){
            if(cleanS.charAt(l) != cleanS.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }    
}