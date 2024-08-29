class Solution:
    def findPair(self, n: int, x: int, arr: List[int]) -> int:
        # Convert the list to a set for O(1) average-time complexity lookups.
        arr_set = set(arr)
        
        # Iterate through the array and check for the condition.
        for num in arr:
            # Check if there exists an element such that the difference is x.
            if (num + x) in arr_set or (num - x) in arr_set:
                return 1
        
        return -1
