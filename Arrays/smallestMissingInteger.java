public class smallestMissingInteger {

        public static void main(String[] args) {
            int[] nums = {3, 4, -1, 1};
            System.out.println("First missing positive: " + firstMissingPositive(nums));
        }

        public static int firstMissingPositive(int[] nums) {
            int n = nums.length;
            int res = -1;
            int[] ans = new int[n + 1];



            // Initialize the array with zeros
            for (int k = 0; k < ans.length; k++) {
                ans[k] = 0;
            }

            // Fill the array with positive integers from nums
            for (int i = 0; i < n; i++) {
                if (nums[i] > 0 && nums[i] <= n) {
                    int a = nums[i];
                    ans[a - 1] = a;
                }
            }

            // Find the first missing positive integer
            for (int j = 0; j < ans.length; j++) {
                if (ans[j] < 1) {
                    res = j + 1;
                    break;
                }
            }

            return res;
        }
}
