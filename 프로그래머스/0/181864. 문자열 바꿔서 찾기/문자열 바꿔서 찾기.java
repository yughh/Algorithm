class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replace("A", "b");
        myString = myString.replace("B", "A");
        myString = myString.replace("b", "B");
        //System.out.println(myString.toString());
        return myString.contains(pat) ? 1:0;
    }
}