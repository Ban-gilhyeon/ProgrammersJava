import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String str[] = s.split(" ");
        String temp[] = s.split("");
        for (String item : str) {
            if(item.equals("")){
                answer += " ";
            }
            else answer += item.substring(0,1).toUpperCase() + item.substring(1,item.length()).toLowerCase() + " ";
        }
        if(temp[temp.length -1].equals(" ")){
            return answer;
        }
        else return answer.substring(0,answer.length()-1);
    }
}