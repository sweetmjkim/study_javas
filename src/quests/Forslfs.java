package quests;
/*
- 입력 받은 값을 2에 지수 연산하고, 4 배수일 때만 출력
ex ) input number : 50
 0 : 2 ** 0 4 배수 아님        -> 확인용
 1 : 2 ** 1 4 배수 아님
 2 ** 2 = 4
 2 ** 3 = 8
 2 ** 4 = 16
...
*/

import java.util.Scanner;

public class Forslfs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int number = scanner.nextInt();

        for (int count = 1 ; count <= 50 ; count ++){
            if (count % 4 == 0){
                System.out.println("결과는 4의 배수 입니다. : " + count);
            }else{
                System.out.println("결과는 4의 배수가 아닙니다. : " + count);
            }
        }
    }
}

// int result = (int) Math.pow(2, 4);