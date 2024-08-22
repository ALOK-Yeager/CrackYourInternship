class Solution {
    public int maxProfit(int[] p) {
        int Max_prof = 0, cp = p[0];
        for(int i = 1; i < p.length; i++){
            if(cp < p[i]) Max_prof += p[i] - cp;
            cp = p[i];
        }
        return Max_prof;
    }
}
