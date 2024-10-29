import java.util.*;

class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String roomNumber = sc.nextLine();
        int[] count = new int[10];
        
        // 각 숫자의 개수를 세기
        for (char ch : roomNumber.toCharArray()) {
            count[ch - '0']++;
        }
        
        // 6과 9는 대체 가능하므로 합쳐서 필요한 세트를 계산
        count[6] = (count[6] + count[9] + 1) / 2;

        // 나머지 숫자 중 가장 많이 필요한 세트 수를 계산
        int answer = 0;
        for (int i = 0; i < 9; i++) {  // 6과 9를 합쳤으므로, 0 ~ 8만 체크
            answer = Math.max(answer, count[i]);
        }
        
        System.out.println(answer);
    }
}