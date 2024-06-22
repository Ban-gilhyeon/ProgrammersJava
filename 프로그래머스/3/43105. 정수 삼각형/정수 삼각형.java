class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int [][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];
        for(int i = 1; i<triangle.length; i++){
            //맨 왼쪽
            dp[i][0] = dp[i-1][0] + triangle[i][0];
            for(int j = 1; j<=i; j++){
                //중간
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + triangle[i][j];
            }
            //맨 오른쪽
            dp[i][i] = dp[i-1][i-1] + triangle[i][i];
        }
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j <= i; j++){
                answer = Math.max(answer, dp[i][j]);
            }
        }

        return answer;
    }
}