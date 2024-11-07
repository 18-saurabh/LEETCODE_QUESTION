public class LC_2275 {
     public int largestCombination(int[] candidates) {
        int maxSubset=0;
        for(int bit=1;bit<32;bit++){
            int cnt=0;
            for(int num:candidates){
                if((num & (1<<bit))!=0){
                    cnt++;
                }
            }
            maxSubset=Math.max(maxSubset, cnt);
        }
        return maxSubset;
     }
}
