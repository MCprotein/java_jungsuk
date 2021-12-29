package ch3_operator;
//3-26
public class OperatorEx26 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
        // ||의 좌측 피연산자만 처리하여 값을 도출했기 때문에 우측 피연산자인 ++b는 처리가 안되어 b는 증가하지 않음
        System.out.printf("a=%d, b=%d%n", a, b);
        System.out.printf("a==0 || ++b!=0 = %b%n", a==0 && ++b!=0);
        // ||의 좌측 피연산자만 처리하여 값을 도출했기 때문에 우측 피연산자인 ++b는 처리가 안되어 b는 증가하지 않음
        System.out.printf("a=%d, b=%d%n", a, b);
    }
}
