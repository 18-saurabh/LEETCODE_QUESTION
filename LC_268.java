class LC_268 {
    public int missingNumber(int[] nums) {
        int sum_1=0;
        int sum_2=0;
        for(int i=0;i<nums.length+1;i++){
            sum_1+=i;
        }
        for(int i=0;i<nums.length;i++){
            sum_2+=nums[i];
        }
        int difference = sum_1-sum_2;
        return  difference;
    }
}
