class Solution {
    public void sortColors(int[] nums) {
        // move mid from 0 to nums.length-1 and keep replacing it with low if nums[mid]=0, and with high if nums[mid]=2, and skip where nums[mid]=1

        int low = 0, high = nums.length-1;
        int mid = 0;

        while(mid<=high){       // because mid is the ptr that tells which elements are still unprocessed
            if(nums[mid]==0){
                //replace with low
                int temp1 = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp1;

                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{      // nums[mid]==2
                // replace with high
                int temp2 = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp2;

                high--;
                // don't do mid++, as the replaced element from high is not checked yet
            }
        }
    }
}