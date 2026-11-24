class Solution {
    public void moveZeroes(int[] nums) {
     int insertZero =0;
     for(int i =0; i<nums.length;i++){
        if(nums[i]!=0){
            nums[insertZero] = nums[i];
            insertZero++;
        }
        
     }  
     while(insertZero < nums.length){
            nums[insertZero] =0;
            insertZero++;
        }  
    }
}