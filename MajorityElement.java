class Solution {
    public int majorityElement(int[] nums) {

        int cnt = 0;
        int majority = -1;

        for(int i=0; i<nums.length; i++){
            if(cnt==0){
                majority = nums[i];
            }
            if(nums[i] == majority){
                cnt++;
            }else{
                cnt--;
            }
        }
        return majority;


        // Map<Integer, Integer> map = new HashMap<>();
        // int majority = 0;
        // int ans = -1;
        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0)+1);
        // }
        // for(int num : nums){
        //     if(majority < map.get(num)){
        //         majority = map.get(num);
        //         ans = num;
        //     }
        // }
        // return ans;
    }
}