class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
       // String[] answer = {};
        String s ="";
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]) s+=todo_list[i]+" ";
        }
        return s.split(" ");
    }
}