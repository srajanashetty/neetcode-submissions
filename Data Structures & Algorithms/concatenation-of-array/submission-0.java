class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];

        /*int index=0;
        for(int i=0;i<2;i++){
            for(int num:nums){
                ans[index]=num;
                index++;
            }
        }
        return ans;*/
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            ans[i]=ans[i+n]=nums[i];
        }
        return ans;
        
    }
}