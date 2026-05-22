class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        int mid = (left+right)/2;
        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1};  // 1-indexed
            }
            else if (sum < target) {
                left++;  // Sum too small, need bigger number
            }
            else {
                right--; // Sum too big, need smaller number
        }
    }
        return new int[]{-1,-1};
    }
}
