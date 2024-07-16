class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int temp = 1;
        boolean ing = true;
        int idx_n = n-1;
        int idx_add = 0;
        int ii = 1;
        while (ing){
            ii++;
            for(int i=idx_add; i<=idx_n; i++){ // 0행(0, n)
                if(answer[idx_add][i] != 0) break;
                answer[idx_add][i] = temp++;
            }

            for(int i= idx_add+1; i<=idx_n; i++){    // | (n,n)
                if(answer[i][idx_n] != 0) break;
                answer[i][idx_n] = temp++;
            }

            for(int i=idx_n-1; i>= idx_add; i--){  //_
                if(answer[idx_n][i] != 0) break;
                answer[idx_n][i] = temp++;
            }

            for(int i=idx_n-1; i>= idx_add+1; i--){ //|
                if(answer[i][idx_add] != 0) break;
                answer[i][idx_add] = temp++;
            }
            if(idx_n > 0) idx_n--;
            if(idx_add<n) idx_add++;
            
            if(ii == n*n) break;
        }
        return answer;
    }
}