class Solution {
    public String convert(String s, int numRows) {
        // if(numRows == 1 || s.length()<=numRows) return s;
        // StringBuilder[] rows = new StringBuilder[numRows];
        // for(int i=0; i<numRows; i++){
        //     rows[i] = new StringBuilder();
        // }

        // int n=0;    //current row
        // boolean down = false;
        // for(char ch : s.toCharArray()){
        //     rows[n].append(ch);

        //     //changing directions at top and bottom
        //     if(n==0 || n==numRows-1){
        //         down = !down;
        //     }

        //     n += (down)? 1:-1;
        // }

        // StringBuilder ans = new StringBuilder();
        // for(StringBuilder sb : rows){
        //     ans.append(sb);
        // }
        // return ans.toString();

        
        // practice 

        if(numRows == 1 || s.length()<=numRows) return s;
        // making sb's = numRows
        StringBuilder[] rows = new StringBuilder[numRows];
        
        //assiging numbers to sb's
        for(int i=0; i<numRows; i++){
            rows[i] = new StringBuilder();
        }
        
        // initializing n and down to false as it will change as n==0(extreme) and then it will continue to go down until n==numRows-1
        int n = 0;
        boolean down = false;

        for(char ch : s.toCharArray()){
            rows[n].append(ch);
            if(n==0 || n==numRows-1){
                down = !down;
            }
            // incrementing or decremnenting i according to direction of down
            n+=(down)? 1:-1;  
        }
        // adding all sb's to res
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb : rows){
            res.append(sb);
        }
        return res.toString();
    }
}