
class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        
        int[] nums = arr.stream().mapToInt(i -> i).toArray();

        
        Arrays.sort(nums);

        
        result.add(toArrayList(nums));

        
        while (nextPermutation(nums)) {
            result.add(toArrayList(nums));
        }

        return result;
    }

    private static boolean nextPermutation(int[] nums) {
        int i = nums.length - 2;

       
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        
        if (i < 0) {
            return false;
        }

        int j = nums.length - 1;

        
        while (j >= 0 && nums[j] <= nums[i]) {
            j--;
        }

        
        swap(nums, i, j);

        
        reverse(nums, i + 1, nums.length - 1);

        return true;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static ArrayList<Integer> toArrayList(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }
}
