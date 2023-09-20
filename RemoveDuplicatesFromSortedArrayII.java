class Solution {
    public int removeDuplicates(int[] nums) {
        // Check if the input array is null or empty
        if (nums == null || nums.length == 0)
            return 0;

        int j = 1;  // Index for the resulting array
        int count = 1;  // Counter for the duplicates

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Check if the current element is equal to the previous element
            if (nums[i] == nums[i - 1])
                count++;
            else
                count = 1;

            // If the count is less than or equal to 2, update the resulting array
            if (count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;  // Return the length of the resulting array
    }
}

// Time Complexity: O(N) - We iterate through the input array once, where N is the length of the array.
// Space Complexity: O(1) - We use a constant amount of extra space regardless of the input array size.
