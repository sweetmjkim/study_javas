package quests;
/*
- refer : https://docs.google.com/document/d/1Sj6bVLXrRrqN8D1NFh1GEU7Ctzj6PsdTOiSdLKD971E/edit
아래는 4개의 Python 관련 문제와 각 문항의 난이도에 따른 점수화
1. 문제: Python에서 변수를 선언하는 방법은? (점수: 10점)
   1) var name, 2) name = value, 3) set name, 4) name == value
   - 정답: 2
2. 문제: Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)
   1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다
   - 정답: 1
3. 문제: Python에서 조건문을 작성하는 방법은? (점수: 10점)
   1) if-else, 2) for-in, 3) while, 4) def
   - 정답: 1
4. 문제: Python에서 함수를 정의하는 방법은? (점수: 5점)
   1) class, 2) def, 3) import, 4) return
   - 정답: 2
- 문항과 답항을 담기
- 문항 갯수 만큼 출력
- 정답은 입력만 받음
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ProblemsWithoutDB {
    public static void main(String[] args){
        ArrayList<HashMap<String, String>> questions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> question1 = new HashMap<>();
        question1.put("문제", "Python에서 변수를 선언하는 방법은? (점수: 10점)");
        question1.put("답항", "1) var name, 2) name=value, 3) set name, 4) name == value");
        questions.add(question1);

        HashMap<String, String> question2 = new HashMap<>();
        question2.put("문제", "Python에서 리스트(List)의 특징은 무엇인가요? (점수: 15점)");
        question2.put("답항", "1) 순서가 있고 변경 가능하다, 2) 중복된 값을 가질 수 없다, 3) 원소를 추가하거나 삭제할 수 없다, 4) 정렬된 상태로 유지된다");
        questions.add(question2);

        HashMap<String, String> question3 = new HashMap<>();
        question3.put("문제", "Python에서 조건문을 작성하는 방법은? (점수: 10점)");
        question3.put("답항", "1) if-else, 2) for-in, 3) while, 4) def");
        questions.add(question3);

        HashMap<String, String> question4 = new HashMap<>();
        question4.put("문제", "Python에서 함수를 정의하는 방법은? (점수: 5점)");
        question4.put("답항", "1) class, 2) def, 3) import, 4) return");
        questions.add(question4);

        for (int i = 0; i < questions.size(); i = i+1) {
            HashMap<String, String> solvingProblems = questions.get(i);
            System.out.println((i + 1) + ". " + "문제 : " + solvingProblems.get("문제"));
            System.out.println("답항: " + solvingProblems.get("답항"));
            System.out.print("-정답: ");
            scanner.nextLine();
            System.out.println();
        }

        scanner.close();
    }
}