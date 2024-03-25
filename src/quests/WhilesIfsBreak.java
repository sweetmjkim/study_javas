package quests;
/*
- 입력 받은 점수를 등급 표시(90이상:A 80이상:B, 70이상:C, 나머진:F
- 종료는 -1
*/

import java.util.Scanner;

public class WhilesIfsBreak {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);   // Scanner를 제대로 초기화합니다.
        while (true) {
            System.out.print("점수 입력해주세요. : (만약 종료를 원하면 -1 입력)");
            int score = scanner.nextInt();  // 사용자로부터 정수형 점수를 입력받습니다.
            if (score == -1) {
                break ;
            }
            else if (score >= 90) {
                System.out.println("90점 이상이므로 A학점 입니다.");
            }
            else if (score >= 80) {
                System.out.println("80점 이상이므로 B학점 입니다.");
            }
            else if (score >= 70) {
                System.out.println("70점 이상이므로 C학점 입니다.");
            }
            else {
                System.out.println("70미만이므로 F학점 입니다.");
            }
        }

        scanner.close();    // Scanner를 닫아줍니다.
    }
}
