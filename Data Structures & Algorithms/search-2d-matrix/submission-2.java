class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int[] row : matrix){
            int l = 0 ;
            int r = row.length-1 ;
            while(l<=r){
                int mid = (l+r)/2;
                if(row[mid]==target){
                    return true;
                }else if(row[mid]<target){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
                
            }
       }    
       return false;
    }
}
