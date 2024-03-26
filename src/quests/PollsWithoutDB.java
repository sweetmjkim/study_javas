package quests;
/*
- 영화 설문 3 문항 하나씩 출력되면서 답하는 설문 구현
ex) 1. 인터스텔라 선호도
1) 좋음 2) 중간 3) 나쁨
        답하기 : 1
    2. 해리 포터 선호도
1) 좋음 2) 중간 3) 나쁨
        답하기 : 3
...
답한 내용 출력 : 1, 3, 1
- scanner.nextLine();
*/

import java.util.Scanner;
import java.util.ArrayList;

public class PollsWithoutDB {
    public static void main(String[] args){
        ArrayList<String> listFilm = new ArrayList<String>();
        listFilm.add("인터스텔라");
        listFilm.add("해리포터");
        listFilm.add("파묘");

        ArrayList<String> listQuestion = new ArrayList<String>();
        listQuestion.add("1) 좋음");
        listQuestion.add("2) 중간");
        listQuestion.add("3) 나쁨");

        ArrayList<String> listAnswer = new ArrayList<String>();
        // 질문의 답을 거치지않고 바로 출력
        // listAnswer.add("1");
        // listAnswer.add("3");
        // listAnswer.add("1");
        
        for(int i=0; i<listFilm.size(); i++){
            System.out.println(listFilm.get(i));
            System.out.println(listQuestion);
            Scanner scanner = new Scanner(System.in);
            System.out.println("당신의 점수를 입력하세요. : ");
            listAnswer.add(scanner.nextLine());
        }
        System.out.println("당신의 평가는" + listAnswer + "입니다.");
    }
}
