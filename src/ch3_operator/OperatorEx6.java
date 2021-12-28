package ch3_operator;
//3-6
public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);
        // a와 b는 모두 int형보다 작은 byte 형이기 때문에 연산자 '+'는 이 두개의 피연산자들의 자료형을 int형으로 변환하여 연산을 수행한다.
        System.out.println(c);
    }
}
