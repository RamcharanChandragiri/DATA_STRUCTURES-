class Solution {
    public boolean search(int[] nums, int target) {
        for(int c:nums){
            if(c==target) return true;
        }
        return false;
    }
}