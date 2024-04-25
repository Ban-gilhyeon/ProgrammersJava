import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
      int cnt = 0;
        HashMap<Integer, Integer> dic = new HashMap<Integer, Integer>();
        int answer = 0;
        for(int i = 0; i< nums.length; i++){
            if(dic.containsKey(nums[i])){
                dic.put(nums[i],dic.get(nums[i]) + 1);
            }
            else{
                dic.put(nums[i],0);
            }
        }
        if(dic.size() > nums.length/2){
            answer = nums.length/2;
        }
        else{
            answer = dic.size();   
        }
        return answer;
    }
}