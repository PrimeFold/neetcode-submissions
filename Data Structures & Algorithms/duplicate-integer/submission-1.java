class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) return false;

        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        for (int i = 0; i < copy.length - 1; i++) {
            if (copy[i] == copy[i + 1]) return true;
        }
        return false;
    }
}