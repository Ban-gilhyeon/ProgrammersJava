class Solution {
   public void dfs(int start, int [][] computers, boolean[] visited){
        visited[start] = true;

        for(int i = 0; i<computers.length; i++){
            if(!visited[i] && computers[start][i] == 1){
                dfs(i, computers, visited);
            }
        }
    }
    public int solution(int n, int [][] computers){
        int answer = 0;
        boolean[] visited = new boolean[computers.length];
        for(int i = 0; i < computers.length; i++){
            visited[i] = false;
        }
        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false){
                answer++;
                dfs(i, computers, visited);
            }
        }

        return answer;
    }
}