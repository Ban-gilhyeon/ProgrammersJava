class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
   int answer = health;
        int suc = 0;
        int attacked = 0;
        for(int i = 1; i <=attacks[attacks.length - 1][0]; i++){
            // 공격 받을 때
            if(i == attacks[attacked][0]){
                answer -= attacks[attacked][1];
                suc = 0;
                attacked++;
            }
            else{
                suc++;
                if(answer + bandage[1] <= health){
                    answer += bandage[1];
                }
                else answer = health;
                if(suc == bandage[0]){
                    if(answer + bandage[2] >= health){
                        answer = health;
                        suc = 0;
                    }
                    else {
                        answer += bandage[2];
                        suc = 0;
                    }
                }
            }
            if(answer <= 0) return -1; // 현재 체력이 0 이하일 때
        }

        return answer;
    }
}