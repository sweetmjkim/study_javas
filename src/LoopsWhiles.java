// refer : https://www.w3schools.com/java/java_while_loop.asp
public class LoopsWhiles {
    public static void main(String[] args){
        // while (condition) {
            
        // }
        // while 내에서 종료 상황 만들기
        int count = 0;
        while (count < 10) {
            count = count + 1;
            System.out.println("종료 상황 만들기 count" + count);
        }

        // while 종료시 break 같이 사용
        count = 0;
        boolean whileFlag = true;
        while (whileFlag) {        // 무한 루프
            count = count + 1;
            System.out.println("break 같이 사용 count" + count);
            if (count >= 10) {
                break;
            }
        }
        System.out.println("Hello Main !");
    }
}
