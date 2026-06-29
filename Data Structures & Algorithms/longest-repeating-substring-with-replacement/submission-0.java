public class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxf = 0;
        int maxLength = 0;

        for(int right = 0 ; right < s.length() ; right++){
            char charOnRight = s.charAt(right);
            int charIndex = charOnRight - 'A';

            count[charIndex] = count[charIndex]+1;

            maxf = Math.max(maxf , count[charIndex]);

            while((right-left+1) - maxf > k){
                count[s.charAt(left)-'A']--;
                left++;
            }

            maxLength = Math.max(maxLength,right-left+1);

        }

        return maxLength;

    }
}