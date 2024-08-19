class Solution {
 public void sortColors(int[] nums) {
        int k = 0, i = 0, r = nums.length - 1;
        while (i <= r) {
            if (nums[i] == 0) 
                swap(nums, k++, i++);
            
            else if (nums[i] == 2) 
                swap(nums, i, r--);
            
            else  i++;
            
        }
    }
    private void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
