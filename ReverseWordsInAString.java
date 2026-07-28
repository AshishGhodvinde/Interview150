class Solution {
    public String reverseWords(String s) {
        //trim and remove whitespaces(+ for multiple)
        // String[] words = s.trim().split("\\s+");

        // StringBuilder sb = new StringBuilder();
        // for(int i=words.length-1 ; i>=0; i--){
        //     //won't add space before first word
        //     sb.append(words[i]);

        //     //then will add space between words except after last
        //     if(i > 0){
        //         sb.append(" ");
        //     }
        // }

        // return sb.toString();

        String[] strs = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=strs.length-1; i>=0; i--){
            sb.append(strs[i]);
            if(i>0){        // for not haivng space after last word
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}