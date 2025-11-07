package _37_Day;

public class SumOfSubarrayRanges {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long totalMax = 0, totalMin = 0;

        // Calculate total contribution of maximums
        for (int i = 0; i < n; i++) {
            int left = i, right = i;

            while (left > 0 && nums[left - 1] < nums[i]) {
                left--;
            }
            while (right < n - 1 && nums[right + 1] <= nums[i]) {
                right++;
            }

            totalMax += (long) nums[i] * (i - left + 1) * (right - i + 1);
        }

        // Calculate total contribution of minimums
        for (int i = 0; i < n; i++) {
            int left = i, right = i;

            while (left > 0 && nums[left - 1] > nums[i]) {
                left--;
            }
            while (right < n - 1 && nums[right + 1] >= nums[i]) {
                right++;
            }

            totalMin += (long) nums[i] * (i - left + 1) * (right - i + 1);
        }

        return totalMax - totalMin;
    }
}

// Dry run for nums = [1, 2, 3]
//
// totalMax accumulation (each nums[i] as subarray maximum):
//   i=0, val=1 -> left=0, right=0                 -> contrib = 1 * (1) * (1) = 1  -> totalMax = 1
//   i=1, val=2 -> left=0 (nums[0] < 2), right=1   -> contrib = 2 * (2) * (1) = 4  -> totalMax = 5
//   i=2, val=3 -> left=0 (nums[1], nums[0] < 3), right=2
//                   contrib = 3 * (3) * (1) = 9  -> totalMax = 14
//
// totalMin accumulation (each nums[i] as subarray minimum):
//   i=0, val=1 -> left=0, right=2 (neighbors >= 1)
//                   contrib = 1 * (1) * (3) = 3  -> totalMin = 3
//   i=1, val=2 -> left=1 (nums[0] <= 2 stops), right=2 (nums[2] >= 2)
//                   contrib = 2 * (1) * (2) = 4  -> totalMin = 7
//   i=2, val=3 -> left=2, right=2                 -> contrib = 3 * (1) * (1) = 3  -> totalMin = 10
//
// Final answer: totalMax - totalMin = 14 - 10 = 4
