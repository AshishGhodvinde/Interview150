class Solution {
    public int removeDuplicates(int[] nums) {
        // int i=0;        // size of result array 
        
        // for(int num : nums){
        //     //checking starts from 3rd place as two same numbers are allowed
        //     if(i < 2 || num != nums[i-2]){         //only increment size when there is another number 
        //         nums[i] = num;      //becasuse of in-place condition
        //         i++;
        //     }
        // }

        // return i;


        int k=0; 

        for(int num : nums){
            if(k<2 || num!=nums[k-2]){
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}