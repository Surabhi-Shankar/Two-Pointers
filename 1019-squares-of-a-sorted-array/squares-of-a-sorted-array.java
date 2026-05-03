class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[]  r = new int[n];
        int l = 0 , h = n - 1;
        for(int i = r.length - 1;i >= 0 ; i--){
            if(Math.abs(nums[l]) > Math.abs(nums[h])){
                r[i] = nums[l] * nums[l];
                l++;
            }else{
                r[i] = nums[h] * nums[h];
                h--;
            }
        }
        return r;
    }
}