package ch4_statement;

import java.util.Scanner;

public class Chapter4Problem {
    public static void main(String[] args) {

        //4-1
        //1.
        int x = 0;
        if (x > 10 && x < 20) {}
        //2.
        char ch = 'a';
        if (ch != ' ' || ch != '\t') {}
        //3.
        char ah = ' ';
        if (ah == 'x' || ah == 'X') {}
        //4.
        char oo = ' ';
        if (oo >= '0' && oo <='9'){}
        //5.
        char bc = ' ';
        if ((bc >= 'a' && bc <= 'z') || (bc >= 'A' && bc <= 'Z')) {}
        //6.
        int year = ' ';
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {}
        //7.
        boolean powerOn = false;
        if (powerOn == false) {}
        //8.
        String str = "";
//        if (str == "yes") {}
        if (str.equals("yes")) {}
        //4-2
        int sum =0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);

        //4-3 모르겠음
        int summ =0;
        int totalsum = 0;
        for (int i = 1; i <= 10; i++) {
            summ += i;
            totalsum += summ;
        }
        System.out.println("4-3 문제 답 : "+totalsum);
        //4-4
        int sumi = 0;
        for (int i = 1; i<10000; i++) {
            if (sumi < 100) {
                if (i % 2 != 0) {
                    sumi += i;
                } else if (i % 2 == 0) {
                    sumi -= i;
                }
                if (sumi >= 100) {
                    System.out.println("4-4 답: " + i);
                    break;
                }
            }
            }
        //4-4 해설풀이
        int ssum = 0; // 총합을 저장할 변수
        int sss = 1; // 값의 부호를 바꿔주는데 사용할 변수
        int nnum = 0;

        // 조건식의 값이 true이므로 무한반복문이 된다.
        for (int i = 1; true; i++, sss = -sss) { // 매 반복마다 s의 값은 1, -1, 1, -1...
            nnum = sss * i;
            ssum += nnum;

            if (ssum >= 100) { //총합이 100보다 같거나 크면 반복문을 빠져 나간다.
                System.out.println("4-4 해설풀이 " + i);
                break;
            }

        }



        //4-5
        for (int i = 0; i <= 10; i++) {
            for(int j=0; j<=1; j++)
                System.out.println("*");
            System.out.println();
        }
        System.out.println("경계");
        //=
        int a = 0;
        while (a < 11) {
            int b = 0;
            while (b < 2) {
                System.out.println("*");
                b++;
            }
            System.out.println();
            a++;
        }

        //4-6
        int ij = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j == 6) {
                    ij = i+j;
                    System.out.println(i + "+" + j +"=" + ij);
                }
            }
        }

        //4-7
        int value = ((int)(Math.random()*6)+1);
        System.out.println("value = " + value);

        //4-8
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (2 * i + 4 * j == 10) {
                    System.out.println("x="+i+", y="+j);
                }
            }
        }
        
        //4-9
        String uoo = "12345";
        int summer = 0;

        for (int i = 0; i < uoo.length(); i++) {
            System.out.println(uoo.charAt(i));
            summer += uoo.charAt(i) - '0';
        }
        System.out.println("summer = " + summer);

        //4-10 함수기억안남
        int num =12345;
        int sum3 = 0;

        while (num > 0) {
            sum3 += num%10;
            num = num/10;
        }
        System.out.println("4-10답 : " + sum3);

        //4-11 보류
        //피보나치 수열의 시작의 첫 두 숫자를 1,1로 한다.
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; //세번째 값
        System.out.print(num1 + "," + num2);

        for (int i = 0; i < 8; i++) {
            num3 = num1+num2; // 세번째 값은 첫번째와 두번째 값을 더해서 얻는다.
            System.out.print("," + num3); // 세번째 수열 출력
            num1=num2;
            num2=num3;
        }
        System.out.println();

        //4-12
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }

        //4-13
        String valuee = "12o34";
        char chch = ' ';
        boolean isNumber = true;

        // 반복문과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
        for (int i = 0; i < valuee.length(); i++) {
            if (!(valuee.charAt(i) >= '0' && valuee.charAt(i) <= '9')) {
                isNumber = false;
            }
        }

        if (isNumber) {
            System.out.println(valuee+"는 숫자입니다.");
        } else {
            System.out.println(valuee+"는 숫자가 아닙니다.");
        }

        //4-15
        int number = 12321;
        int tmpp = number;

        int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

        while (tmpp != 0) {
            result = tmpp%10 + result*10; // 기존 결과에 10을 곱해서 더한다.
            tmpp = tmpp/10;
        }

        if (number == result)
            System.out.println(number + "는 회문수 입니다.");
        else
            System.out.println(number + "는 회문수가 아닙니다.");

        //4-14
        // 1~100 사이의 임의의 값을 얻어서 answer에 저장한다.
        int answer = (int) (Math.random() * 100)+1;
        int input = 0; // 사용자 입력을 저장할 공간
        int count = 0; // 시도 횟수를 세기위한 변수
        System.out.println("answer = " + answer);
        // 화면으로부터 사용자입력을 받기 위해서 Scanner 클래스 사용
        Scanner s = new Scanner(System.in);

        do {
            count++;
            System.out.print("1과 100 사이의 값을 입력하세요 : ");
            input = s.nextInt(); //입력받은 값을 변수 input에 저장한다.

            if (input == answer) {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 "+count+"번입니다.");
                break;
            } else if (input < answer) {
                System.out.println("더 큰 수를 입력하세요.");
            } else {
                System.out.println("더 작은 수를 입력하세요");
            }

        } while(true); //무한 반복문


    }

}