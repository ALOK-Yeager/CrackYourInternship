class Solution {
    public int[] twoSum(int[] nums, int result) {
        int n = nums.length;

        for(int i =0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
            if (nums[i] + nums[j] == result) {
                    return new int[]{i, j};

                }

            }

        }

        return new int []{};

    }
}
