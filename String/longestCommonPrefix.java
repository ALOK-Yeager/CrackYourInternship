class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int end = strs[0].length();

        for (int i = 1; i < strs.length; i++){
            end = Math.min(strs[i].length(), end);
            for (int j = 0; j < end; j++){
                if (strs[i].charAt(j) != prefix.charAt(j)){
                    end = j;
                    break;
                }
            }
            if (end == 0){
                return "";
            }
        }

        return prefix.substring(0, end);
    }
}
