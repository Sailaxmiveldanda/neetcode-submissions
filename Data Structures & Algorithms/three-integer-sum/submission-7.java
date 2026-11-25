class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) return res;
        for(int i =0; i < nums.length ; i++){
            if(i >0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length - 1;
            int digit = nums[i];
            while(left < right){
                int sum = nums[left] + nums[right] + digit;
                if(sum == 0){
                    res.add(Arrays.asList(digit, nums[left],nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
                else if(sum > 0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return res;
    }
}
