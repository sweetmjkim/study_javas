// refer : https://www.w3schools.com/java/java_strings.asp

public class DataTypeStrings {
    public static void main(String[] args){
        String strFirst = "Hello !";
        String strSecond = new String("World !");
        
        // 클래스를 상속 받았는지 확인
        // strFirst instanceof String
        // true
        // strSecond instanceof String
        // true

        // 길이 확인
        // strFirst.length()
        // 7
        // strSecond.length()
        // 7

        // 글자 붙이기
        // strSecond.concat(strFirst)
        // "World !Hello !"

        // 글자 바꾸기
        // String strThird = strFirst.replaceAll("l", "R")
        // strFirst.replaceAll("ll", "RR")
        // "HeRRo !"
        System.out.println("Hello World !");
    }
}
