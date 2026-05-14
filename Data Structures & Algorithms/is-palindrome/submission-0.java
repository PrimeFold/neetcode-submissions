class Solution {
    public boolean isPalindrome(String s) {
        String noPunct = s.replaceAll("\\p{Punct}", "");
        String result = noPunct.replace(" ", "");
        int left = 0;
        int right = result.length()-1;
        while(left<=right){
            char lch = result.charAt(left);
            char rch = result.charAt(right);
            char lowerLch = Character.toLowerCase(lch);
            char lowerRch = Character.toLowerCase(rch);

            if(lowerLch==lowerRch){
                left +=1;
                right-=1;
            }else{
                return false;
            }
            
        }
        return true;
        
    }
}
