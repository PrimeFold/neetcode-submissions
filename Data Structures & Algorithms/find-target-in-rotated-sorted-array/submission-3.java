class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int m = l+(r-l)/2;
            if(nums[m]>nums[r]){
                l = m + 1;
            }else{
                r = m;
            }
        }

        int pivot = l;

        int left,right;
        if(target>=nums[pivot] && target<=nums[nums.length-1]){
            left = pivot;
            right = nums.length-1;
        }else{
            left = 0;
            right = pivot-1;
        }

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }

        }

        return -1;
    }


}
