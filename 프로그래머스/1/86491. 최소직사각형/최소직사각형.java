class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        int maxX = 0;
        int maxY = 0;
        
        
        for(int i = 0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        for(int i=0; i<sizes.length; i++){
            if(maxX < sizes[i][0]){
                maxX = sizes[i][0];
            }
            if(maxY < sizes[i][1]){
                maxY = sizes[i][1];
            }
        }
        
        return answer = maxX*maxY;
    }
}