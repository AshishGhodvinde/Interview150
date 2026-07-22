class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}


//k will keep track of elemnts that can be replaced(for eg. if i is somewhere ahead and k will be at back where it will be at nums[i]==val then when i will found element diff than val it will be replaced by nums[k])
// k will be slow and i will go ahead in search of elements other than val
//initially i and k will be equal till i encounters val ,when that happens only i will be incremented 