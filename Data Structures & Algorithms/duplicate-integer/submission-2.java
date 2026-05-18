class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length==0) return false;

        int[] duplicate = Arrays.copyOf(nums,nums.length);
        Arrays.sort(duplicate);

        for(int i = 0; i<duplicate.length-1;i++){
            if(duplicate[i]==duplicate[i+1]){
                return true;
            }
        }
        return false;
        
    }
}