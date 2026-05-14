class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sarry = s.toCharArray();
        char [] tarry =  t.toCharArray();
        Arrays.sort(sarry);
        Arrays.sort(tarry);
        String sortedS = new String(sarry);
        String sortedT = new String(tarry);

        if(sortedS.equals(sortedT)){
            return true;
        }
        return false;
    }
}
