class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p = 0;
        
        if(a == b && b == c && c ==d) {
            answer += 1111 * a;
        }else if((a == b && b == c) ||(a == c && c ==d)||(b == c && c ==d) || (a == b && b == d) ){
           
            if(a == b && b == c)  answer += (10*a + d) * (10*a + d);
            if(a == c && c ==d)  answer += (10*a + b) * (10*a + b);
            if(b == c && c ==d)  answer += (10*b + a) * (10*b + a);
            if(a == b && b == d)  answer += (10*a + c) * (10*a + c);

        }
        else if((a==b && c ==d)|| (a == c && b ==d) || (a==d && b==c)){
            if(a==b) answer = (a+c) *Math.abs(a-c);
            if(a==c) answer = (a+b) *Math.abs(a-b);
            if(a==d) answer = (a+b) *Math.abs(a-b);

            }
        else if((a == b && c != d )|| (a == c && b != d) || (a == d && b != c) || (b == c && a != d) ||(b == d && a != c) || (c == d && a != b)){
                if((a == b && c != d ))  answer = c * d;
                if((a == c && b != d ))  answer = b * d;
                if((a == d && b != c))  answer = b * c;
                if((b == c && a != d))  answer = a * d;
                if((b == d && a != c))  answer = a * c;
                if((c == d && a != b))  answer = a * b;
            //System.out.println("a" + a +"d" + d +  )
            
        }
        else{
             p = a;
            if(b<a) p = b;
            if(c<b) p = c;
            if(d<c) p = d;
            answer = p;
        } 
        return answer;
    }
}