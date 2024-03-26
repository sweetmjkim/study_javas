import java.util.Scanner;

public class TypeCastIntegers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 두개 값 받기
        String strFirst = scanner.nextLine();
        String strSecond = scanner.nextLine();
        // strFirst + strSecond
        // "12"

        int intFirst = Integer.parseInt(strFirst);
        int intSecond = Integer.parseInt(strSecond);
        // intFirst + intSecond
        // 3

        scanner.close();
    }
}
