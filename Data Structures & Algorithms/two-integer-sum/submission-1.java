// class Solution{
//     public int[] twoSum(int[] nums, int target){
//         for(int i = 0; i< nums.length; i++){
//             for(int j = i+1; j<nums.length; j++){
//                 if(nums[i]+nums[j] == target){
//                     return new int[]{i, j};
//                 }
//             }
//         }return new int[0];
//     }
// }

class Solution{
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if(prevMap.containsKey(diff)){
                return new int[]{prevMap.get(diff), i};
            }
            prevMap.put(num, i);
        }
        return new int[]{};
    }
}