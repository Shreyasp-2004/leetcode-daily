class Solution {
    public int longestOnes(int[] nums, int k) {
       int count=0 ,  l=0, zero=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0)zero++;
                
            while(zero>k){
                if(nums[l]==0)zero--;l++;                
                
            }
        count=Math.max(count,i-l+1);
        }
        return count;
    }
}