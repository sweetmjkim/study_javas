// refer : https://www.w3schools.com/java/java_for_loop.asp
/*
for 반복문 (for statement)
- 특정 변수가 증감하며 조건에 부합할 때까지 반복하는 반복문  
- 사용방법 : 
   for ( 변수 선언 혹은 초기화;  조건;  증감식 ) { 실행할 코드 }
- 변수 선언 혹은 초기화 : 반복문을 위해 사용할 변수를 선언 혹은 초기화
- 조건 : 반복을 계속하기 위한 조건, true 이면 반복, false 이면 탈출
- 실행할 코드 : 조건이 true 일 때 실행할 코드
- for 문 실행 순서 : ① 변수선언 및 초기화 ② 조건 ③ 실행할 코드 ④ 증감식
refer : https://blog.naver.com/dev_kwak/223049366604
*/

public class LoopsFors {
    public static void main(String[] args){
        /*
            for 동작 위한 조건 : 반복 횟수, 종료 조건, 시작점
            statement 1 : 시작점(변수 선언 or 초기화)
            statement 2 : 종료 조건(조건)
            statement 3 : 반복 횟수(증감식)
         for (statement 1 ; statement 2 ; statement 3){

         }
         */
        /*
        예제 : 1 부터 5 까지 1씩 증가하며 출력하는 것
         */

        // for (int count = 1 ; count <= 5 ; count = count + 1){        아래와 동일하다.
        for (int count = 1 ; count <= 5 ; count ++){
            System.out.println("For count : "+ count);
        }
        System.out.println("Hello Main !");
    }
}
