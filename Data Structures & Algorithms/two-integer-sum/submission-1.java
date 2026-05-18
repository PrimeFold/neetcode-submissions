class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> table = new Hashtable<>();
        for(int i = 0 ; i<=nums.length-1; i++){
            int complement = target - nums[i];
            if(table.containsKey(complement)){
                return new int[]{table.get(complement), i};
            }
            table.put(nums[i],i);
        }
        return new int[]{};   
    }
}
