class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int mid = nums[nums.length/2];
        for(int num : nums){
            ans += Math.abs(mid-num);
        }
        return ans;
    }
}
