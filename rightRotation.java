public class Solution {

    // Helper function to reverse part of the array
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate array to the right by k steps
    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        // Handle cases where k > n
        k = k % n;

        // Step 1: Reverse entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // Call rotate function
        rotate(nums, k);

        // Print the rotated array
        System.out.println("Rotated Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
