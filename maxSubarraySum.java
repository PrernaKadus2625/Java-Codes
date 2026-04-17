class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];          // add current element

            if (sum > max) {         // update max sum
                max = sum;
            }

            if (sum < 0) {           // reset if sum becomes negative
                sum = 0;
            }
        }

        return max;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        Solution obj = new Solution();

        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}
