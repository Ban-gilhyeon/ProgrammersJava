import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int temp1 = 0; int temp2 =0;
        Arrays.sort(numbers);
        
        temp1 = numbers[numbers.length-1] * numbers[numbers.length-2];
        temp2 = numbers[0] * numbers[1];
        answer = Math.max(temp1,temp2);
        return answer;
    }
}