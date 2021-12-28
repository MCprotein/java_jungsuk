package ch2;

import java.util.*;
//2-6
public class ScannerEx {

    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input); //입력받은 문자열을 정수형 int로 변환


 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해주세요.>");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input); //입력받은 문자열을 정수로 변환
//        int non = scanner.nextInt();
        //변환없이 바로 숫자로 입력받을 수 있는 메서드, 화면에서 연속적으로 값을 입력받아서 사용하기에 까다롭다.nextLine()으로 받는게 더 낫다.

        System.out.println("입력내용 :" + input);
        System.out.printf("num%d%n", num);
//        System.out.printf("non%d%n", non);

    }


}
