import java.util.*;

class Solution {

    // Function to remove duplicates from sorted array
    public int removeDuplicates(int[] nums) {
        int i = 0;  // points to last unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;  // count of unique elements
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example input (sorted array)
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int k = sol.removeDuplicates(nums);

        // Print number of unique elements
        System.out.println("Number of unique elements: " + k);

        // Print updated array (only first k elements are valid)
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
