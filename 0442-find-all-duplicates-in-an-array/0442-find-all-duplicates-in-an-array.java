class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer>res =new ArrayList<>();
       for(int n: nums){
        if(nums[Math.abs(n)-1]<0){
            res.add(Math.abs(n));
        }
        else{
            nums[Math.abs(n)-1]= -nums[Math.abs(n)-1];
        }
       } 
       return res;
    }
}