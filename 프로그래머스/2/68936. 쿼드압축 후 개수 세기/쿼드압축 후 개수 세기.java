class Solution {
    int []answer = new int[2];
    public boolean checkPress(int [][] arr, int x, int y, int size, int temp) {
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x+size; j++) {
                if (temp != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void divQuad(int [][] arr, int x, int y, int size){
            int [][] divArr = new int[size][size];
            if(checkPress(arr,x,y,size,arr[y][x])){
                if(arr[y][x]==1){
                     answer[1]++;
                }
                else answer[0]++;
                return;
            }
            divQuad(arr,x,y,size/2);
            divQuad(arr,x+ (size/2) ,y,size/2);
            divQuad(arr,x,y+(size/2),size/2);
            divQuad(arr,x+(size/2),y+(size/2),size/2);
    }
    public int [] solution(int [][] arr){
        
        divQuad(arr,0,0,arr.length);
        return answer;
    }
}