package quests;
// 외부 입력
import java.util.Scanner;

public class Additions {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("intFirst : ");
        int intFirst = Scanner.nextInt();
        System.out.print("intSecond : ");
        int intSecond = Scanner.nextInt();
        int intAnswer = intFirst + intSecond;
        System.out.print("Answer is : " + intAnswer);

        Scanner.close();
    }
}
