import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hashMap = new HashMap<>();
       for(String item : participant){
           hashMap.put(item,hashMap.getOrDefault(item,0)+1);
       }
       for(String item : completion) {
           hashMap.put(item,hashMap.get(item)-1);
       }

       for(String key : hashMap.keySet()){
           if(hashMap.get(key) != 0){
               answer = key;
           }
       }
       return answer;
    }
}