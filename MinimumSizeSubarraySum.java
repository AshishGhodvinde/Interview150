class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // 1. Make the window to ideal length (sum>=target)
        // 2. Remove the left most element (left++)
        // 3. Check the condition, if passed update the answer (if ans>curLength, ans=curLength)

        // int n = nums.length, left = 0, windowSum = 0, ans = n + 1;

        // for (int right = 0; right < n; right++) {
        //     windowSum += nums[right];

        //     while (windowSum >= target) {
        //         ans = Math.min(ans, right - left + 1);
        //         //remove leftmost element and increment by 1
        //         windowSum -= nums[left++];
        //     }
        // }
        // return ans == n + 1 ? 0 : ans;

        // size is not fixed but the constraint is on window sum
        int n = nums.length;
        int left = 0, winSum = 0, ans = n+1;
        for(int right = 0; right<n; right++){
            winSum+=nums[right];
            while(winSum >= target){            //continous checking till the winSum>=0
                ans = Math.min(ans, right-left+1);
                winSum-=nums[left];
                left++;
            }
        }
        return ans==n+1? 0:ans;
    }
}