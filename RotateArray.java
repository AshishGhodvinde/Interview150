class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n<=1)    return;

        if(k>=n)    k=k%n;

        rev(nums, 0, n-1-k);
        rev(nums, n-k, n-1);
        rev(nums, 0, n-1);
    }

    public void rev(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}